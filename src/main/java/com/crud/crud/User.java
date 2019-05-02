package com.crud.crud;

import com.crud.crud.services.UserServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@SpringBootApplication
@RestController
@RequestMapping("/users")
public class User {

    @Autowired
    private UserServices userService;

    @GetMapping("/all")
    public String getallusers() {
        return userService.findallusers();
    }

}
