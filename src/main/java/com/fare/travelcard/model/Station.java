package com.fare.travelcard.model;

import javax.persistence.*;

@Entity
@Table(name = "station")
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "stationname",unique = true)
    private String stationName;

    @Column(name = "zone")
    private String zone;

    protected Station() {
    }

    public Station(String stationname, String zone) {
        this.stationName = stationname;
        this.zone = zone;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
