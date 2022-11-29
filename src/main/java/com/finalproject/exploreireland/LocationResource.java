package com.finalproject.exploreireland;

import com.finalproject.exploreireland.model.Location;
import com.finalproject.exploreireland.service.LocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;


//Controller Class

@RestController
@RequestMapping("/location")
public class LocationResource {

    private final LocationService locationService;

    public LocationResource(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Location>> getAllLocations(){
        List<Location> locations = locationService.findAllLocations();
        return new ResponseEntity<>(locations, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Location> getLocationById(@PathVariable("id") Long id){
        Location location = locationService.findLocationById(id);
        return new ResponseEntity<>(location, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Location> addLocation(@RequestBody Location location){
        Location newLocation = locationService.addLocation(location);
        return new ResponseEntity<>(newLocation, HttpStatus.CREATED);
    }


    @PutMapping("/update")
    public ResponseEntity<Location> updateLocation(@RequestBody Location location){
        Location updateLocation = locationService.updateLocation(location);
        return new ResponseEntity<>(updateLocation, HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteLocation(@PathVariable("id") Long id){
        locationService.deleteLocation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
