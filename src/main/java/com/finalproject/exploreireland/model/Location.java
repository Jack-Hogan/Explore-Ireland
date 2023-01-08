package com.finalproject.exploreireland.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity //mapping class into table in database
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Location implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false, updatable = false)
    private long id;

    private String name;
    private String url;
    private String telephone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="geo_id", referencedColumnName = "id")
    @JsonManagedReference
    private GeoCoordinates geo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    @JsonManagedReference
    private PostalAddress address;

    private String[] tags;

}
