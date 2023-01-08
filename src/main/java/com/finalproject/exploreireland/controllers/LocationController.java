package com.finalproject.exploreireland.controllers;

import com.finalproject.exploreireland.model.Location;
import com.finalproject.exploreireland.service.LocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;


/**
 * Location REST controller that uses http requests, GET, POST, UPDATE and PUT methods.
 * This handles all incoming location requests and information from the front-end.
 */
@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600, allowCredentials="true")
@RestController
@RequestMapping("/location")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    /**
     * GET method to return all locations saved by the user
     * @return list of all locations
     */
    @GetMapping("/all")
    public ResponseEntity<List<Location>> getAllLocations(){
        List<Location> locations = locationService.findAllLocations();
        return new ResponseEntity<>(locations, HttpStatus.OK);
    }

    /**
     * GET method to return single location by its id
     * @param id
     * @return single location by id
     */
    @GetMapping("/find/{id}")
    public ResponseEntity<Location> getLocationById(@PathVariable("id") Long id){
        Location location = locationService.findLocationById(id);
        return new ResponseEntity<>(location, HttpStatus.OK);
    }

    /**
     * POST method that adds the location chosen by the user to the location service
     * @param location
     * @return HTTP response status
     */
    @PostMapping("/add")
    public ResponseEntity<Location> addLocation(@RequestBody Location location){
        Location newLocation = locationService.addLocation(location);
        return new ResponseEntity<>(newLocation, HttpStatus.CREATED);
    }


    /**
     * UPDATE method that sends the updated location to the location service
     * @param location
     * @return HTTP response status
     */
    @PutMapping("/update")
    public ResponseEntity<Location> updateLocation(@RequestBody Location location){
        Location updateLocation = locationService.updateLocation(location);
        return new ResponseEntity<>(updateLocation, HttpStatus.OK);
    }

    /**
     * DELETE method that deletes the given location by id
     * @param id
     * @return HTTP response status
     */
    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteLocation(@PathVariable("id") Long id){
        locationService.deleteLocation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
