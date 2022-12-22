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
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "geo_id", nullable = false, updatable = false)
    private GeoCoordinates geo;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "address_id", nullable = false, updatable = false)
    private PostalAddress address;

    @Column( insertable = false, updatable = false)
    private String geo_id;
    @Column( insertable = false, updatable = false)
    private String address_id;

    private String[] tags;

    public Location() {
    }

    public Location(String name) {
        this.name = name;
    }


    public Location(long id, String name, String url, String telephone, GeoCoordinates geo, PostalAddress address, String geo_id, String address_id, String[] tags) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.telephone = telephone;
        this.geo = geo;
        this.address = address;
        this.geo_id = geo_id;
        this.address_id = address_id;
        this.tags = tags;
    }

    public Location(String name, String url) {
        this.name = name;
        this.url = url;

    }

    public String getGeo_id() {
        return geo_id;
    }

    public void setGeo_id(String geo_id) {
        this.geo_id = geo_id;
    }

    public String getAddress_id() {
        return address_id;
    }

    public void setAddress_id(String address_id) {
        this.address_id = address_id;
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
                ", tags='" + tags + '\'' +
                '}';
    }
}
