package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloExample {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello hello! Dockerized Spring Boot JR!";
    }

    @GetMapping("/page1")
    public String page1() {
        return "Hello to page 1 of Dockerized Spring Boot JR!";
    }
}