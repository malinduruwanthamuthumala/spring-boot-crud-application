package com.crud.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * greeting
 */
@SpringBootApplication
@RestController
@RequestMapping("/api")
public class first {

    @GetMapping("/hello2")
    public String hello2() {
        return "hello world2";
    }

}