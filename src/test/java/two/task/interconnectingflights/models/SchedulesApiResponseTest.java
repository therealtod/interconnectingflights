package two.task.interconnectingflights.models;


import com.fasterxml.jackson.databind.ObjectMapper;
import two.task.interconnectingflights.Constants;
import two.task.interconnectingflights.models.responses.SchedulesApiResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
public class SchedulesApiResponseTest {
    @Test
    public void testGetDay() {
        try {
            final SchedulesApiResponse schedulesApiResponse = new ObjectMapper()
                    .readValue(Constants.schedulesAPIresponse,
                            SchedulesApiResponse.class);
            Day nonExistingDay = schedulesApiResponse.getDay(2);
            assertNull(nonExistingDay);
            Day existingDay = schedulesApiResponse.getDay(3);
            assertEquals(3, existingDay.getDay().intValue());
        } catch (Exception ex) {
            assert (false);
        }
    }
}
