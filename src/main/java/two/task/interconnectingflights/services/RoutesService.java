package two.task.interconnectingflights.services;

import two.task.interconnectingflights.models.Route;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoutesService {
    private Logger logger = LoggerFactory.getLogger(SchedulesService.class);

    @Value("${routes.url}")
    private String routesUrl;

    @Autowired
    private RestTemplate restTemplate;


    public List<Route> getFilteredRoutesFromAPI(String departure) {
        return getRoutesFromAPI(departure).stream()
                .filter(r -> r.getConnectingAirport() == null
                        && r.getOperator().equals("RYANAIR"))
                .collect(Collectors.toList());
    }

    @Cacheable("routes")
    public List<Route> getRoutesFromAPI(String departure) {
        logger.info("AIR:" + departure);
        ResponseEntity<List<Route>> response;
        String requestUrl = routesUrl + departure;
        logger.info("Performing GET request to: " + requestUrl);
        try {
            response = this.restTemplate
                    .exchange(requestUrl,
                            HttpMethod.GET,
                            null,
                            new ParameterizedTypeReference<List<Route>>() {
                            });
        } catch (RestClientException ex) {
            return Collections.emptyList();
        }


        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            return Collections.emptyList();
        }

    }
}
