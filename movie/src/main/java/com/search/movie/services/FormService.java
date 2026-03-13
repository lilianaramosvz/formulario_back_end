package com.search.movie.services;

import com.search.movie.dto.BusquedaRequest;
import com.search.movie.dto.BusquedaResponse;
import com.search.movie.dto.Pelicula;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

/**
 *
 * @author sammy
 */

@Service
public class FormService {
    
    public BusquedaResponse buscarPeliculas(BusquedaRequest request){
        BusquedaResponse response = new BusquedaResponse();
        
        try {
            InputStream inputStream = new ClassPathResource("Peliculas.json").getInputStream();
            ObjectMapper mapper = new ObjectMapper();
            
            List<Pelicula> todas = mapper.readValue(inputStream, new TypeReference<List<Pelicula>>(){});
            
            List<Pelicula> filtradas = todas.stream()
                    .filter(p -> request.getTitulo() == null || request.getTitulo().isEmpty() || p.getTitulo().toLowerCase().contains(request.getTitulo().toLowerCase()))
                    .filter(p -> request.getAnio() == null || request.getAnio().isEmpty() || p.getAnio().equals(request.getAnio()))
                    .filter(p -> request.getTipo() == null || request.getTipo().isEmpty() || p.getTipo().equalsIgnoreCase(request.getTipo()))
                    .filter(p -> request.getGenero() == null || request.getGenero().isEmpty() || p.getGenero().equalsIgnoreCase(request.getGenero()))
                    .collect(Collectors.toList());
            
            String nombre = (request.getNombreUsuario() != null && !request.getNombreUsuario().isEmpty())
                    ? request.getNombreUsuario()
                    : "Catador de cine";
                    
            response.setMensaje("Hola " + nombre + ", encontramos " + filtradas.size() + " resultado(s) para tu busqueda.");
            response.setResultados(filtradas);
        
        } catch (Exception e) {
            e.printStackTrace();
            response.setMensaje("Ocurrió un error al procesar la búsqueda.");
            response.setResultados(List.of());
        }
        
        return response;
    }
}