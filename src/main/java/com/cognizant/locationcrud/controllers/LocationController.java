package com.cognizant.locationcrud.controllers;

import com.cognizant.locationcrud.models.LocationEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/location")
@CrossOrigin(value = "*")
public class LocationController {

    @GetMapping
    public List<LocationEntity> getAllLocations(){
        return null;
    }

    @GetMapping(path = "/{locationId}")
    public LocationEntity getLocationById(@PathVariable Integer locationId){
        return null;
    }

}
