package com.example.test.service;

import com.example.test.model.Plane;
import com.example.test.repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlaneService {

    @Autowired
    private PlaneRepository planeRepository;

    public List<Plane> getAllPlanes(){

        return planeRepository.findAll();
    }

    public Optional <Plane> getPLaneById(String Id){

        return planeRepository.findById(Id);
    }

    public void deleteById(String Id){

        planeRepository.deleteById(Id);
    }

    public Plane createPlane(Plane plane){

        return planeRepository.save(plane);
    }

    public void deleteAllPlanes(){

        planeRepository.deleteAll();
    }
}
