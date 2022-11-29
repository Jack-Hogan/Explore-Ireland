package com.finalproject.exploreireland.repo;

import com.finalproject.exploreireland.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LocationRepo extends JpaRepository<Location, Long> {

    void deleteLocationById(Long id);

    Optional<Location> findLocationById(Long id);
}
