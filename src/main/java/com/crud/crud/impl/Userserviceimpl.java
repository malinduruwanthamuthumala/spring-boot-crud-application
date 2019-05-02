package com.crud.crud.impl;

import com.crud.crud.services.UserServices;

import org.springframework.stereotype.Service;

@Service
public class Userserviceimpl implements UserServices {
    @Override
    public String findallusers() {
        return "all users new";
    }
}