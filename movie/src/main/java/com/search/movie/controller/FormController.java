/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.search.movie.controller;

import com.search.movie.dto.BusquedaRequest;
import com.search.movie.dto.BusquedaResponse;
import com.search.movie.services.FormService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sammy
 */

@RestController
@RequestMapping("/api/movies")
@CrossOrigin(origins = "*")
public class FormController {
    private final FormService formService;
    
    public FormController(FormService formService){
        this.formService = formService;
    }
    
    @PostMapping("/search")
    public ResponseEntity<BusquedaResponse> searchMovies(@RequestBody BusquedaRequest request){
        BusquedaResponse response = formService.buscarPeliculas(request);
        
        return ResponseEntity.ok(response);
    }
}
