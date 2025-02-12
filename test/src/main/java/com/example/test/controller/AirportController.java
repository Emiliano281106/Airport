package com.example.test.controller;

import com.example.test.model.Airport;
import com.example.test.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AirportController {

    @Autowired
    AirportRepository airportRepository;

    @GetMapping("/airports")
    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }
}
