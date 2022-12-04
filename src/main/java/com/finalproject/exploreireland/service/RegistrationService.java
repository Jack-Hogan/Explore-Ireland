package com.finalproject.exploreireland.service;

import com.finalproject.exploreireland.appUser.AppUser;
import com.finalproject.exploreireland.appUser.AppUserRole;
import com.finalproject.exploreireland.registration.RegistrationRequest;
import com.finalproject.exploreireland.validation.EmailValidator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;
    private final EmailValidator emailValidator;

    public String register(RegistrationRequest request) {

       boolean isValidEmail =  emailValidator.test(request.getEmail());

       if(!isValidEmail){
           throw new IllegalStateException("email not valid");
       }

        return appUserService.signUpUser(
                new AppUser(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER
                )
        );
    }
}