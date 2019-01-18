package com.angusyg.sba.authentication.service;

import com.angusyg.sba.authentication.dto.SignUpDto;
import com.angusyg.sba.authentication.dto.UserDto;
import com.angusyg.sba.model.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"h2", "postgresql"})
public class DatabaseAuthenticationService implements AuthenticationService {
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto signUp(SignUpDto signUpDto) {
        User user = new User();
        user.setId(1);
        user.setLogin("login");
        user.setPassword("password");
        user.setEmail("email");
        return modelMapper.map(user, UserDto.class);
    }
}

