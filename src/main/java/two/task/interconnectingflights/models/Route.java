package two.task.interconnectingflights.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Route {
    /*
     * POJO class representing a single Route returned by the Routes API.
     * Used to deserialize the response.
     */
    @JsonProperty("airportFrom")
    private String airportFrom;
    @JsonProperty("airportTo")
    private String airportTo;
    @JsonProperty("connectingAirport")
    private Object connectingAirport;
    @JsonProperty("newRoute")
    private Boolean newRoute;
    @JsonProperty("seasonalRoute")
    private Boolean seasonalRoute;
    @JsonProperty("operator")
    private String operator;
    @JsonProperty("group")
    private String group;
    @JsonProperty("similarArrivalAirportCodes")
    private List<String> similarArrivalAirportCodes = null;
    @JsonProperty("tags")
    private List<Object> tags = null;
    @JsonProperty("carrierCode")
    private String carrierCode;

    @JsonProperty("airportFrom")
    public String getAirportFrom() {
        return airportFrom;
    }

    @JsonProperty("airportFrom")
    public void setAirportFrom(String airportFrom) {
        this.airportFrom = airportFrom;
    }

    @JsonProperty("airportTo")
    public String getAirportTo() {
        return airportTo;
    }

    @JsonProperty("airportTo")
    public void setAirportTo(String airportTo) {
        this.airportTo = airportTo;
    }

    @JsonProperty("connectingAirport")
    public Object getConnectingAirport() {
        return connectingAirport;
    }

    @JsonProperty("connectingAirport")
    public void setConnectingAirport(Object connectingAirport) {
        this.connectingAirport = connectingAirport;
    }

    @JsonProperty("newRoute")
    public Boolean getNewRoute() {
        return newRoute;
    }

    @JsonProperty("newRoute")
    public void setNewRoute(Boolean newRoute) {
        this.newRoute = newRoute;
    }

    @JsonProperty("seasonalRoute")
    public Boolean getSeasonalRoute() {
        return seasonalRoute;
    }

    @JsonProperty("seasonalRoute")
    public void setSeasonalRoute(Boolean seasonalRoute) {
        this.seasonalRoute = seasonalRoute;
    }

    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    @JsonProperty("similarArrivalAirportCodes")
    public List<String> getSimilarArrivalAirportCodes() {
        return similarArrivalAirportCodes;
    }

    @JsonProperty("similarArrivalAirportCodes")
    public void setSimilarArrivalAirportCodes(List<String> similarArrivalAirportCodes) {
        this.similarArrivalAirportCodes = similarArrivalAirportCodes;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    @JsonProperty("carrierCode")
    public String getCarrierCode() {
        return carrierCode;
    }

    @JsonProperty("carrierCode")
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    @Override
    public String toString() {
        return "Route{" +
                "airportFrom='" + airportFrom + '\'' +
                ", airportTo='" + airportTo + '\'' +
                ", connectingAirport=" + connectingAirport +
                ", newRoute=" + newRoute +
                ", seasonalRoute=" + seasonalRoute +
                ", operator='" + operator + '\'' +
                ", group='" + group + '\'' +
                ", similarArrivalAirportCodes=" + similarArrivalAirportCodes +
                ", tags=" + tags +
                ", carrierCode='" + carrierCode + '\'' +
                '}';
    }
}
