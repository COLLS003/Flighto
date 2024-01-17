package com.air.mongoFlights.flights;

import org.springframework.data.annotation.Id;

public class Flight {
    @Id private String id;
    private String origin;
    private String destination;
    private String departure;

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public String getPilot() {
        return pilot;
    }

    private String arrival;

    public String getId() {
        return id;
    }

    private String pilot;

}
