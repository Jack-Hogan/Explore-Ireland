package com.finalproject.exploreireland.controllers;

import com.finalproject.exploreireland.model.User;
import com.finalproject.exploreireland.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller to allow Admin to view list of all Users
 */
@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600, allowCredentials="true")
@RestController
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    /**
     * GET method to return list of users for any Admin role
     * @return List of Users
     */
    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = adminService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
