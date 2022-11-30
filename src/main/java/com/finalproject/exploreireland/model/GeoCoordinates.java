package com.finalproject.exploreireland.model;

import java.io.Serializable;

public class GeoCoordinates implements Serializable {

    private float latitude;

    private float longitude;

    public GeoCoordinates(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public GeoCoordinates(){

    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
