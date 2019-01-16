package com.angusyg.sba.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity(name = "USERS")
public class User {
    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true, nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;
}

