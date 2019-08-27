package two.task.interconnectingflights.models;

import java.util.Objects;

public class Segment {
    private String fromAirport;
    private String toAirport;

    public Segment(String fromAirport, String toAirport) {
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public String getToAirport() {
        return toAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Segment segment = (Segment) o;
        return fromAirport.equals(segment.fromAirport) &&
                toAirport.equals(segment.toAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromAirport, toAirport);
    }
}
