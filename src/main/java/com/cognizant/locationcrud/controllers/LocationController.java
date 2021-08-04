package com.cognizant.locationcrud.controllers;

import com.cognizant.locationcrud.models.Location;
import com.cognizant.locationcrud.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/location")
@CrossOrigin(value = "*")
public class LocationController {
    private ServiceLayer service;

    @Autowired
    public LocationController(ServiceLayer service){
        this.service = service;
    }

    @GetMapping(path = "/product/{productId}")
    public List<Location> getLocationByProductId(@PathVariable Long productId){
        return service.getLocationsByProductId(productId);
    }

}
