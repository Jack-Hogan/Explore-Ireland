package com.finalproject.exploreireland.repo;

import com.finalproject.exploreireland.model.ERole;
import com.finalproject.exploreireland.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);


}
