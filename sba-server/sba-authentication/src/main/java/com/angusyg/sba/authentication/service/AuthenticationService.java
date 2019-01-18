package com.angusyg.sba.authentication.service;

import com.angusyg.sba.authentication.dto.SignUpDto;
import com.angusyg.sba.authentication.dto.UserDto;

public interface AuthenticationService {
    UserDto signUp(SignUpDto signUpDto);
}
