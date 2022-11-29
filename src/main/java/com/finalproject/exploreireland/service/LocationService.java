package com.finalproject.exploreireland.service;

import com.finalproject.exploreireland.exception.LocationNotFoundException;
import com.finalproject.exploreireland.model.Location;
import com.finalproject.exploreireland.repo.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    private final LocationRepo locationRepo;

    @Autowired
    public LocationService(LocationRepo locationRepo) {
        this.locationRepo = locationRepo;
    }

    public Location addLocation (Location location){
        return locationRepo.save(location);
    }

    public List<Location> findAllLocations(){
        return locationRepo.findAll();
    }

    public Location updateLocation(Location location){
        return locationRepo.save(location);
    }

    public Location findLocationById(Long id){
        return locationRepo.findLocationById(id)
                .orElseThrow(() -> new LocationNotFoundException("Location by id " + id + " was not found."));
    }

    public void deleteLocation(Long id){
        locationRepo.deleteLocationById(id);
    }
}
