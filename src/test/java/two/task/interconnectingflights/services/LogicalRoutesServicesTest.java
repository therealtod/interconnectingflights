package two.task.interconnectingflights.services;

import static org.junit.Assert.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;
import two.task.interconnectingflights.Constants;
import two.task.interconnectingflights.models.LogicalRoute;
import two.task.interconnectingflights.models.Route;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
public class LogicalRoutesServicesTest {
    @Mock
    private RoutesService routesService;

    @InjectMocks
    private LogicalRoutesService logicalRoutesService;

    @Test
    public void getRoutesTest() {
        /*
         * Let's suppose we have the following graph (nodes are airports)
         * A connects to B, C and D (and viceversa)
         * B connects to D and viceversa
         * C connects to D and viceversa
         */
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Route> routesAAA = mapper.readValue(Constants.airportAAARoutes,
                    new TypeReference<List<Route>>() {});
            List<Route> routesBBB = mapper.readValue(Constants.airportBBBRoutes,
                    new TypeReference<List<Route>>() {});
            List<Route> routesCCC = mapper.readValue(Constants.airportCCCRoutes,
                    new TypeReference<List<Route>>() {});
            List<Route> routesDDD = mapper.readValue(Constants.airportCCCRoutes,
                    new TypeReference<List<Route>>() {});
            Mockito.when(routesService.getFilteredRoutesFromAPI("AAA"))
                    .thenReturn(routesAAA);
            Mockito.when(routesService.getFilteredRoutesFromAPI("BBB"))
                    .thenReturn(routesBBB);
            Mockito.when(routesService.getFilteredRoutesFromAPI("CCC"))
                    .thenReturn(routesCCC);
            Mockito.when(routesService.getFilteredRoutesFromAPI("DDD"))
                    .thenReturn(routesDDD);
            List<LogicalRoute> logicalRoutes = logicalRoutesService
                    .getRoutes("AAA", "DDD", 1);
            List<LogicalRoute> expected = new ArrayList<LogicalRoute>();
            expected.add(new LogicalRoute(List.of("AAA", "DDD")));
            expected.add(new LogicalRoute(List.of("AAA", "BBB", "DDD")));
            assertArrayEquals(expected.toArray(), logicalRoutes.toArray());
        } catch (IOException ex) {
            ex.printStackTrace();
            assert(false);
        }

    }
}
