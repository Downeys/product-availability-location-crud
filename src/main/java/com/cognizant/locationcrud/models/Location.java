package com.cognizant.locationcrud.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer locationId;
    private String locname;
    private Integer zipcode;

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getLocname() {
        return locname;
    }

    public void setLocname(String locname) {
        this.locname = locname;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(locationId, location.locationId) && Objects.equals(locname, location.locname) && Objects.equals(zipcode, location.zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationId, locname, zipcode);
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", locname='" + locname + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
