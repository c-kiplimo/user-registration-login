package com.collicode.security.security.controller;


import com.collicode.security.security.entity.RegistrationRequest;
import com.collicode.security.security.service.RegistrationService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {
    private RegistrationService registrationService;
    public String register(@RequestBody RegistrationRequest registrationRequest){
        return  registrationService.register(registrationRequest);
    }
}
