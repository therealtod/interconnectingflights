package two.task.interconnectingflights.services;

import two.task.interconnectingflights.models.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

@Service
public class InterconnectedFlightsSolutionsService {

    @Value("${interconnections.max_stops}")
    private int maxStops;

    private Logger logger = LoggerFactory
            .getLogger(InterconnectedFlightsSolutionsService.class);
    @Autowired
    private SchedulesService schedulesService;

    @Autowired
    private LogicalRoutesService logicalRoutesService;

    private List<Solution> getSolutionsForRoute(LocalDateTime departureDateTime,
                                                LocalDateTime arrivalDateTime,
                                                LogicalRoute route) {
        logger.debug("Selected route:");
        logger.debug(route.toString());
        ArrayList<Solution> solutions = new ArrayList<>();
        Queue<Solution> solutionsUnderConstruction = new LinkedList<>();
        solutionsUnderConstruction.add(new Solution());
        while (!solutionsUnderConstruction.isEmpty()) {
            logger.debug("Solutions under construction:");
            logger.debug(solutionsUnderConstruction.toString());
            Solution currentSolution = solutionsUnderConstruction.remove();
            logger.debug("Current solution:");
            logger.debug(currentSolution.toString());
            Segment segment = route
                    .getSegment(currentSolution
                            .getLegs().size() + 1);
            LocalDateTime intermediateDepartureDateTime = departureDateTime;
            List<Leg> currentSolutionLegs = currentSolution.getLegs();
            logger.debug("Current solution legs:");
            logger.debug(currentSolutionLegs.toString());
            if (currentSolutionLegs.size() != 0) {
                Leg lastLeg = currentSolutionLegs
                        .get(currentSolutionLegs.size() - 1);
                logger.debug(lastLeg.getDepartureDateTime());
                logger.debug(lastLeg.getArrivalDateTime());
                intermediateDepartureDateTime = LocalDateTime
                        .of(departureDateTime.toLocalDate(),
                                LocalDateTime
                                        .parse(lastLeg.getArrivalDateTime())
                                        .toLocalTime()
                                        .plus(2, ChronoUnit.HOURS));
            }
            logger.debug("intermediateDepartureTime:"
                    + intermediateDepartureDateTime.toString());
            List<Flight> flights = schedulesService.getFlights(
                    segment.getFromAirport(),
                    segment.getToAirport(),
                    intermediateDepartureDateTime,
                    arrivalDateTime
            );
            if (flights.size() == 0) {
                logger.debug("Dead end:" +
                        " we can't reach the destination from here");
                continue;
            }
            List<Leg> legs = flights.stream()
                    .map(f -> new Leg(
                            segment.getFromAirport(),
                            segment.getToAirport(),
                            departureDateTime.toLocalDate(),
                            f
                    )).collect(Collectors.toList());
            for (Leg leg : legs) {
                Solution solution = new Solution(currentSolution);
                solution.addLeg(leg);
                if (leg.getArrivalAirport()
                        .equals(route.getFinalDestination())) {
                    logger.debug("Completed solution:");
                    solutions.add(solution);
                } else {
                    logger.debug("Partial solution:");
                    solutionsUnderConstruction.add(solution);
                }
                logger.debug(solution.toString());
            }
        }

        return solutions;
    }

    public List<Solution> getSolutions(String departure,
                                       String arrival,
                                       String departureDateTimeString,
                                       String arrivalDateTimeString) {
        ArrayList<Solution> solutions = new ArrayList<>();
        List<LogicalRoute> routes = logicalRoutesService
                .getRoutes(departure, arrival, maxStops);
        LocalDateTime departureDateTime = LocalDateTime
                .parse(departureDateTimeString);
        LocalDateTime arrivalDateTime = LocalDateTime
                .parse(arrivalDateTimeString);
        logger.debug("Valid routes:");
        logger.debug(routes.toString());
        for (LogicalRoute route : routes) {
            solutions.addAll(getSolutionsForRoute(departureDateTime
                    , arrivalDateTime,
                    route));
        }
        return solutions;
    }
}
