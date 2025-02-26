
package com.example.test.controller;

import com.example.test.model.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.test.repository.PlaneRepository;

import java.util.List;

@RestController
public class PlaneController {

    @Autowired
    PlaneRepository planeRepository;

    @GetMapping("/planes")
    public List<Plane> getAllPlanes() {
        return planeRepository.findAll();
    }
}