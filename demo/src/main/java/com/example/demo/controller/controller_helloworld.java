package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class controller_helloworld {
    
    @GetMapping("/")
    public String getMethodName() {
        return new String("saludar");
    }
    
}
