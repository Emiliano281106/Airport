package com.example.test.controller;

import com.example.test.model.Passenger;
import com.example.test.repository.PassengerRepository;
import com.example.test.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

    @Autowired
    PassengerService passengerService;

    @GetMapping
    public List<Passenger>getAllPassengers() {

        return passengerService.getAllPassengers();
    }

    @GetMapping("/{id}")
    public Passenger getPassengerById(@PathVariable String id){

        return passengerService.getPassengerById(id).orElse(null);
    }

    @PostMapping
    public Passenger createPassenger(@RequestBody Passenger passenger){

        return passengerService.createPassenger(passenger);
    }

    @DeleteMapping
    public String deleteAllPassengers(){

        passengerService.deleteAllPlanes();

        return "All passengers deleted";
    }
}
