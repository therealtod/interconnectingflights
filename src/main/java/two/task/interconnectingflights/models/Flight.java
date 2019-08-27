package two.task.interconnectingflights.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flight {
    /*
     * POJO class representing the a single flight in the response of the
     * schedules API
     */
    @JsonProperty("carrierCode")
    private String carrierCode;
    @JsonProperty("number")
    private String number;
    @JsonProperty("departureTime")
    private String departureTime;
    @JsonProperty("arrivalTime")
    private String arrivalTime;

    @JsonProperty("carrierCode")
    public String getCarrierCode() {
        return carrierCode;
    }

    @JsonProperty("carrierCode")
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("departureTime")
    public String getDepartureTime() {
        return departureTime;
    }

    @JsonProperty("departureTime")
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @JsonProperty("arrivalTime")
    public String getArrivalTime() {
        return arrivalTime;
    }

    @JsonProperty("arrivalTime")
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public boolean departsNotBefore(LocalTime localTime) {
        LocalTime departureLocalTime = LocalTime.parse(this.departureTime);
        return !departureLocalTime.isBefore(localTime);
    }

    public boolean arrivesNotAfter(LocalTime localTime) {
        LocalTime departureLocalTime = LocalTime.parse(this.departureTime);
        return !departureLocalTime.isAfter(localTime);
    }


    @Override
    public String toString() {
        return "Flight{" +
                "carrierCode='" + carrierCode + '\'' +
                ", number='" + number + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                '}';
    }
}

