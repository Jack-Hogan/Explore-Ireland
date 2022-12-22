package com.finalproject.exploreireland.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "postalAddress")
public class PostalAddress implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Integer address_id;
    private String addressRegion;
    private String addressLocality;
    private String addressCountry;

    public PostalAddress() {
    }

    public PostalAddress(String addressRegion, String addressLocality, String addressCountry) {
        this.addressRegion = addressRegion;
        this.addressLocality = addressLocality;
        this.addressCountry = addressCountry;
    }

    public Integer getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
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
}
