package com.angusyg.sba.authentication.controller;

import com.angusyg.sba.authentication.dto.SignUpDto;
import com.angusyg.sba.authentication.dto.UserDto;
import com.angusyg.sba.authentication.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AuthenticationController {
    @Autowired
    private AuthenticationService authenticationService;

    public UserDto signUp(@Valid SignUpDto signUpDto) {
        return authenticationService.signUp(signUpDto);
    }
}
