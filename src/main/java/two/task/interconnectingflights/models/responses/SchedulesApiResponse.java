package two.task.interconnectingflights.models.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import two.task.interconnectingflights.models.Day;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SchedulesApiResponse {
    /*
     * POJO class used to deserialize the response of the schedules API.
     */
    private Integer month;
    @JsonProperty("days")
    private List<Day> days = null;

    @JsonProperty("month")
    public Integer getMonth() {
        return month;
    }

    @JsonProperty("month")
    public void setMonth(Integer month) {
        this.month = month;
    }

    @JsonProperty("days")
    public List<Day> getDays() {
        return days;
    }

    @JsonProperty("days")
    public void setDays(List<Day> days) {
        this.days = days;
    }

    public Day getDay(int day) {
        /*
         * Convenience method used to get just a specific Day object
         * (representing the flights of a given day), if it can be found.
         * If the selected day is not available, it returns null.
         */
        return days.stream().filter(d -> d.getDay().equals(day))
                .findAny()
                .orElse(null);
    }
}
