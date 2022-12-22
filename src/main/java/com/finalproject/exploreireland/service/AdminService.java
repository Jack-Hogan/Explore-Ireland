package com.finalproject.exploreireland.service;

import com.finalproject.exploreireland.model.User;
import com.finalproject.exploreireland.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    private final UserRepository userRepo;

    @Autowired
    public AdminService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }


    public List<User> findAllUsers(){
        return userRepo.findAll();
    }
}
