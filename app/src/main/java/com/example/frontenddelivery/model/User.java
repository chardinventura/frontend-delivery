package com.example.frontenddelivery.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Long id;
    private Byte avatar;
    private String firstname;
    private String lastname;
    private String username;
    private String phone;
    private String password;
}
