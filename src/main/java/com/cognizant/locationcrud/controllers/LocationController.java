package com.cognizant.locationcrud.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/healthCheck")
@CrossOrigin(value = "*")
public class LocationController {

    @GetMapping
    public String healthCheck(){
        return "LocationCrud API and the pipeline is healthy";
    }
}
