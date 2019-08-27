package two.task.interconnectingflights.models;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalTime;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
public class FlightTest {

    @Test
    public void testFlightDepartsNotBeforeEarlierTime() {
        LocalTime localTime = LocalTime.parse("09:00");
        Flight flight = new Flight();
        flight.setDepartureTime("09:30");
        assertTrue(flight.departsNotBefore(localTime));
    }

    @Test
    public void testFlightDepartsNotBeforeSameTime() {
        LocalTime localTime = LocalTime.parse("09:00");
        Flight flight = new Flight();
        flight.setDepartureTime("09:00");
        assertTrue(flight.departsNotBefore(localTime));
    }

    @Test
    public void testFlightDepartsNotBeforeLaterTime() {
        LocalTime localTime = LocalTime.parse("09:00");
        Flight flight = new Flight();
        flight.setDepartureTime("08:30");
        assertFalse(flight.departsNotBefore(localTime));
    }

    @Test
    public void testFlightArrivesNotAfterEarlierTime() {
        LocalTime localTime = LocalTime.parse("09:00");
        Flight flight = new Flight();
        flight.setDepartureTime("09:30");
        assertFalse(flight.arrivesNotAfter(localTime));
    }

    @Test
    public void testFlightArrivesNotAfterSameTime() {
        LocalTime localTime = LocalTime.parse("09:00");
        Flight flight = new Flight();
        flight.setDepartureTime("09:00");
        assertTrue(flight.arrivesNotAfter(localTime));
    }

    @Test
    public void testFlightArrivesNotAfterLaterTime() {
        LocalTime localTime = LocalTime.parse("09:30");
        Flight flight = new Flight();
        flight.setDepartureTime("09:00");
        assertTrue(flight.arrivesNotAfter(localTime));
    }

}
