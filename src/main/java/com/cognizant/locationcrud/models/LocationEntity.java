package com.cognizant.locationcrud.models;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "location")
public class LocationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long locationId;
    private String locname;
    private Integer zipcode;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
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
        LocationEntity that = (LocationEntity) o;
        return Objects.equals(locationId, that.locationId) && Objects.equals(locname, that.locname) && Objects.equals(zipcode, that.zipcode) && Objects.equals(inventory, that.inventory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationId, locname, zipcode, inventory);
    }

    @Override
    public String toString() {
        return "LocationEntity{" +
                "locationId=" + locationId +
                ", locname='" + locname + '\'' +
                ", zipcode=" + zipcode +
                ", inventory=" + inventory +
                '}';
    }
}
