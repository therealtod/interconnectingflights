package two.task.interconnectingflights.models;


import java.time.LocalDate;

public class Leg {
    /*
     * This class represents the single flight of the set of flights that can
     * compose a Solution.
     * For memory efficiency, We are using Strings to store the datetimes
     * for the departure and arrival "timestamps". Using LocalDateTime would
     * compensate the cost with convenient methods for manipulation
     */
    private String departureAirport;
    private String arrivalAirport;
    private String departureDateTime;
    private String arrivalDateTime;

    @Override
    public String toString() {
        return "Leg{" +
                "departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", departureDateTime='" + departureDateTime + '\'' +
                ", arrivalDateTime='" + arrivalDateTime + '\'' +
                '}';
    }

    public Leg(String departure,
               String arrival,
               LocalDate localDate,
               Flight flight) {
        departureAirport = departure;
        arrivalAirport = arrival;
        departureDateTime = String
                .format("%sT%s", localDate, flight.getDepartureTime());
        arrivalDateTime = String
                .format("%sT%s", localDate, flight.getArrivalTime());
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }
}
