package two.task.interconnectingflights.models;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class LegTest {

    @Test
    public void testLegConstructor() {
        String departure = "DEP";
        String arrival = "ARR";
        LocalDate localDate = LocalDate.parse("2007-12-03");
        Flight flight = Mockito.mock(Flight.class);
        Mockito.when(flight.getDepartureTime()).thenReturn("10:00");
        Mockito.when(flight.getDepartureTime()).thenReturn("12:00");
        Leg leg = new Leg(departure, arrival, localDate, flight);
        assertEquals(leg.getDepartureAirport(), departure);
        assertEquals(leg.getArrivalAirport(), arrival);
        assertEquals(leg.getDepartureDateTime(), localDate.toString()
                + "T" + flight.getDepartureTime());
    }

}
