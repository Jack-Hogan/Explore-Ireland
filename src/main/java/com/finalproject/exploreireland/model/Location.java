package com.finalproject.exploreireland.model;

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
    private String telephone;
    private GeoCoordinates geo;

    private PostalAddress address;

    private String longitude;
    private String latitude;

    private String addressRegion;
    private String addressLocality;
    private String addressCountry;

    private String[] tags;

    public Location() {
    }

    public Location(String name) {
        this.name = name;
    }

    public Location(long id, String name, String url, String phone, GeoCoordinates geo, PostalAddress address, String longitude, String latitude, String addressRegion, String addressLocality, String addressCountry, String[] tags) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.telephone = phone;
        this.geo = geo;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
        this.addressRegion = addressRegion;
        this.addressLocality = addressLocality;
        this.addressCountry = addressCountry;
        this.tags = tags;
    }

    public Location(String name, String url) {
        this.name = name;
        this.url = url;

    }

    public PostalAddress getAddress() {
        return address;
    }

    public void setAddress(PostalAddress address) {
        this.address = address;
    }

    public GeoCoordinates getGeo() {
        return geo;
    }

    public void setGeo(GeoCoordinates geo) {
        this.geo = geo;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String phone) {
        this.telephone = phone;
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

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", phone='" + telephone + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", addressRegion='" + addressRegion + '\'' +
                ", addressLocality='" + addressLocality + '\'' +
                ", addressCountry='" + addressCountry + '\'' +
                ", tags='" + tags + '\'' +
                '}';
    }
}
