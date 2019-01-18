package com.angusyg.sba.authentication.dto;

import lombok.Data;

@Data
public class UserDto {
    private int id;
    private String login;
    private String password;
    private String email;
}
