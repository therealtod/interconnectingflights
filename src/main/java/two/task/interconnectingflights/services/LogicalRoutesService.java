package two.task.interconnectingflights.services;

import two.task.interconnectingflights.models.LogicalRoute;
import two.task.interconnectingflights.models.Route;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class LogicalRoutesService {
    private Logger logger = LoggerFactory.getLogger(LogicalRoutesService.class);

    @Autowired
    private RoutesService routesService;

    public List<LogicalRoute> getRoutes(String departure,
                                        String arrival,
                                        int maxNumberOfStops) {
        /* Find all the possible logical routes (lists of Routes) connecting
         * departure and arrival
         * POSSIBLE IMPROVEMENT :
         * This would be much more efficient if we already had the list of the
         *  airports pre-computed or even better the whole graph representing
         * the connections among airports.
         */
        if (departure.equals(arrival)) {
            /*
             * Special case: if we are asked to go from A to A, we say we can't
             */
            return Collections.emptyList();
        }
        ArrayList<String> visited = new ArrayList<>();
        visited.add(departure);
        Queue<ArrayList<String>> paths = new LinkedList<>();
        ArrayList<String> initialPath = new ArrayList<>();
        initialPath.add(departure);
        paths.add(initialPath);
        ArrayList<LogicalRoute> routes = new ArrayList<>();
        while (!paths.isEmpty()) {
            ArrayList<String> currentRoute = paths.remove();
            logger.debug("currentRoute: " + currentRoute.toString());
            int currentNumberOfAirportsInRoute = currentRoute.size();
            String currentAirport = currentRoute
                    .get(currentNumberOfAirportsInRoute - 1); //the last airport
            if (currentAirport.equals(arrival)) {
                logger.debug("New route found!");
                logger.debug(currentRoute.toString());
                routes.add(new LogicalRoute(currentRoute));
                continue;
            }
            if (currentNumberOfAirportsInRoute == maxNumberOfStops + 2) {
                continue;
            }
            List<String> possibleDestinations = routesService
                    .getFilteredRoutesFromAPI(
                            currentAirport)
                    .stream().map(Route::getAirportTo)
                    .collect(Collectors.toList());
            for (String destination : possibleDestinations) {
                if (!visited.contains(destination)) {
                    ArrayList<String> currentRouteCopy = new ArrayList(currentRoute);
                    currentRouteCopy.add(destination);
                    paths.add(currentRouteCopy);
                }
            }
        }
        return routes;
    }
}
