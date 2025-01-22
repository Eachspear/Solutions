package com.eachspear.Solutions.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @RequestMapping("/Home")
    public String greet()
    {
        return "Welcome to Solutions";
    }
}
