package two.task.interconnectingflights.models;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class LogicalRouteTest {
    @Test
    public void testGetSegment() {
        String airport1 = "ONE";
        String airport2 = "TWO";
        String airport3 = "THREE";
        String airport4 = "FOUR";
        List<String> listOfAirports = List.of(
                airport1, airport2, airport3, airport4
        );
        LogicalRoute logicalRoute = new LogicalRoute(listOfAirports);
        assertEquals(logicalRoute.getSegment(2),
                new Segment(airport2, airport3));
        assertEquals(logicalRoute.getSegment(3),
                new Segment(airport3, airport4));
    }
}
