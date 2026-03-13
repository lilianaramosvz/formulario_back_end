/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.search.movie.dto;
import lombok.Data;

/**
 *
 * @author sammy
 */

@Data
public class BusquedaRequest {
    private String nombreUsuario; // Campo de usuario que realiza la peticion
    private String titulo;
    private String anio;
    private String tipo;
    private String genero;
}