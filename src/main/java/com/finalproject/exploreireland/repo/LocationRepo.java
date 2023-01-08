package com.finalproject.exploreireland.repo;

import com.finalproject.exploreireland.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Location repository interface that extends JPA Repository
 */
@Repository
public interface LocationRepo extends JpaRepository<Location, Long> {

    void deleteLocationById(Long id);

    Optional<Location> findLocationById(Long id);
}
