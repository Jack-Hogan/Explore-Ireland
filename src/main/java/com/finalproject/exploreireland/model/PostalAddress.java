package com.finalproject.exploreireland.model;

import java.io.Serializable;

public class PostalAddress implements Serializable {

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
