/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.search.movie.dto;
import lombok.Data;
import java.util.List;

/**
 *
 * @author sammy
 */

@Data
public class BusquedaResponse {
    private String mensaje;
    private List<Pelicula> resultados;
}