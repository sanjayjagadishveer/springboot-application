package com.example.FirstApplication.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("test")
    public String myFirstMethod()
    {
        return  "controller class";
    }
}
