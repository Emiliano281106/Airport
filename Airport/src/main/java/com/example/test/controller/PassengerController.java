package com.example.test.controller;

import com.example.test.model.Passenger;
import com.example.test.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PassengerController {

    @Autowired
    PassengerRepository passengerRepository;

    @GetMapping("/passengers")
    public List<Passenger>getAllPassengers() {
        return passengerRepository.findAll();
    }
}
