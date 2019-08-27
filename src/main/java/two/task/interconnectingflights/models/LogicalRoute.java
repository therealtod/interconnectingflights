package two.task.interconnectingflights.models;


import java.util.List;
import java.util.Objects;

public class LogicalRoute {
    /*
     * Convenience class, representing the list of Route objects that compose
     * the path from the departure airport to the arrival airport.
     */
    private List<String> airports;

    public List<String> getAirports() {
        return airports;
    }

    public LogicalRoute(List<String> airports) {
        this.airports = airports;
    }

    public Segment getSegment(int segmentNumber) {
        return new Segment(airports.get(segmentNumber - 1),
                airports.get(segmentNumber));
    }

    public String getFinalDestination() {
        return airports.get(airports.size() - 1);
    }

    @Override
    public String toString() {
        return "LogicalRoute{" +
                "airports=" + airports +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogicalRoute)) return false;
        LogicalRoute that = (LogicalRoute) o;
        return Objects.equals(airports, that.airports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airports);
    }
}
