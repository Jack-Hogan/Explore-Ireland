package com.finalproject.exploreireland.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "geoCoordinates")
public class GeoCoordinates implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer geo_id;
    private float latitude;

    private float longitude;

    public GeoCoordinates(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public GeoCoordinates(){

    }

    public Integer getGeo_id() {
        return geo_id;
    }

    public void setGeo_id(Integer geo_id) {
        this.geo_id = geo_id;
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
