package com.finalproject.exploreireland.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity //mapping class into table in database
@Data
public class Location implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private long id;
    private String name;
    private String url;
    private String phone;

    @Column(nullable = false, updatable = false)
    private String longitude;
    @Column(nullable = false, updatable = false)
    private String latitude;

    private String addressRegion;
    private String addressLocality;
    private String addressCountry;
    private String tags;

    public Location() {
    }

    public Location(long id, String name, String url, String phone, String longitude, String latitude, String addressRegion, String addressLocality, String addressCountry, String tags) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.phone = phone;
        this.longitude = longitude;
        this.latitude = latitude;
        this.addressRegion = addressRegion;
        this.addressLocality = addressLocality;
        this.addressCountry = addressCountry;
        this.tags = tags;
    }
}
