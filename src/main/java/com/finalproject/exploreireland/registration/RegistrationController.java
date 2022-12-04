package com.finalproject.exploreireland.registration;

import com.finalproject.exploreireland.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/registration")
@AllArgsConstructor
public class RegistrationController {

    private RegistrationService registrationService;


    @PostMapping("/register")
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }

}