package com.finalproject.exploreireland.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity //mapping class into table in database
public class Location implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private String name;
    private String url;
    private String phone;

    private String longitude;
    private String latitude;

    private String addressRegion;
    private String addressLocality;
    private String addressCountry;
    private String tags;

    public Location() {
    }

    public Location(String name) {
        this.name = name;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getAddressRegion() {
        return addressRegion;
    }

    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }

    public String getAddressLocality() {
        return addressLocality;
    }

    public void setAddressLocality(String addressLocality) {
        this.addressLocality = addressLocality;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", phone='" + phone + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", addressRegion='" + addressRegion + '\'' +
                ", addressLocality='" + addressLocality + '\'' +
                ", addressCountry='" + addressCountry + '\'' +
                ", tags='" + tags + '\'' +
                '}';
    }
}
