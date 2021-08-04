package com.cognizant.locationcrud.service;

import com.cognizant.locationcrud.models.Location;
import com.cognizant.locationcrud.repos.InventoryRepo;
import com.cognizant.locationcrud.repos.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLayer {
    InventoryRepo inventoryRepo;
    LocationRepo locationRepo;

    @Autowired
    public ServiceLayer(InventoryRepo inventoryRepo, LocationRepo locationRepo){
        this.inventoryRepo = inventoryRepo;
        this.locationRepo = locationRepo;
    }

    public List<Location> getLocationsByProductId(Long productId){
        return null;
    }
}
