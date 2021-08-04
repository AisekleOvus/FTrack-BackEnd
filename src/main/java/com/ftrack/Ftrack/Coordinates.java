package com.ftrack.Ftrack;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Coordinates {
    private @Id @GeneratedValue Long id;
    private String Longitude;
    private String Latitude;
    private String Accuracy;
    private String Provider;

    Coordinates(){}
    Coordinates(String Longitude, String Latitude, String Accuracy, String Provider) {
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.Accuracy = Accuracy;
        this.Provider = Provider;
    }

    public Long getId() {
        return id;
    }

    public String getProvider() {
        return Provider;
    }

    public void setProvider(String provider) {
        Provider = provider;
    }

    public String getAccuracy() {
        return Accuracy;
    }

    public void setAccuracy(String accuracy) {
        Accuracy = accuracy;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    @Override
    public String toString() {
        return "Lonfitude: " + Longitude + ", " + "Latitude: " + Latitude + ", Accuracy: "
                + Accuracy + "m, Provider: " + Provider;
    }
}
