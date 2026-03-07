package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.services.SumaService;

import java.util.Map;

@RestController
@RequestMapping("/api/suma")
public class SumaController {

    private  SumaService sumaService;

    public SumaController(SumaService sumaService) {
        this.sumaService = sumaService;
    }

    @PostMapping
    public Map<String, Double> sumar(@RequestBody Map<String, Double> datos) {

        Double numero1 = datos.get("numero1");
        Double numero2 = datos.get("numero2");

        Double resultado = sumaService.sumar(numero1, numero2);

        return Map.of("resultado", resultado);
    }
}