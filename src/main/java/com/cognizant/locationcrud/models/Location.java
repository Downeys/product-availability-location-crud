package com.cognizant.locationcrud.models;

import java.util.List;
import java.util.Objects;

public class Location {
    private Long locationId;
    private String locname;
    private Integer zipcode;
    private List<InventoryEntity> inventory;

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
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

    public List<InventoryEntity> getInventory() {
        return inventory;
    }

    public void setInventory(List<InventoryEntity> inventory) {
        this.inventory = inventory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(locationId, location.locationId) && Objects.equals(locname, location.locname) && Objects.equals(zipcode, location.zipcode) && Objects.equals(inventory, location.inventory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationId, locname, zipcode, inventory);
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", locname='" + locname + '\'' +
                ", zipcode=" + zipcode +
                ", inventory=" + inventory +
                '}';
    }
}
