package com.example.demo.services;


import org.springframework.stereotype.Service;

@Service
public class SumaService {

    public Double sumar(Double numero1, Double numero2) {
        return numero1 + numero2;
    }
}