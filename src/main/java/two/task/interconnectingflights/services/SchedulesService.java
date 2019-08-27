package two.task.interconnectingflights.services;

import two.task.interconnectingflights.models.Day;
import two.task.interconnectingflights.models.Flight;
import two.task.interconnectingflights.models.responses.SchedulesApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchedulesService {
    private Logger logger = LoggerFactory.getLogger(SchedulesService.class);

    @Value("${schedules.url}")
    private String schedulesUrl;

    @Autowired
    private RestTemplate restTemplate;

    public List<Flight> getFlights(String departure,
                                   String arrival,
                                   LocalDateTime departureLocalDateTime,
                                   LocalDateTime arrivalLocalDateTime) {
        SchedulesApiResponse response = getSchedulesFromAPI(departure,
                arrival,
                departureLocalDateTime.getYear(),
                departureLocalDateTime.getMonthValue());
        if (response == null) {
            return Collections.emptyList();
        }
        Day selectedDay = response
                .getDay(departureLocalDateTime.getDayOfMonth());
        // if empty object created with new this fails
        if (selectedDay == null) {
            return Collections.emptyList();
        } else {
            return selectedDay.getFlights().stream()
                    .filter(f -> f.departsNotBefore(departureLocalDateTime.toLocalTime())
                            && f.arrivesNotAfter(arrivalLocalDateTime.toLocalTime()))
                    .collect(Collectors.toList());
        }
    }

    @Cacheable("schedules")
    private SchedulesApiResponse getSchedulesFromAPI(String departure,
                                                     String arrival,
                                                     int year,
                                                     int month) {
        ResponseEntity<SchedulesApiResponse> response;
        String requestUrl = schedulesUrl +
                String.format("%s/%s/years/%d/months/%d",
                        departure, arrival, year, month);
        logger.info("Performing GET request to: " + requestUrl);
        try {
            response = this.restTemplate
                    .getForEntity(requestUrl,
                            SchedulesApiResponse.class);
        } catch (RestClientException ex) {
            return null;
        }


        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            return null;
        }

    }

}

