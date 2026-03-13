# formulario_back_end

## Index

- [What does this backend?](#What-does-this-backend?)
- [How can I run it?](#How-can-I-run-it?)
- [Hown can I apply the requests?](#Hown-can-I-apply-the-requests?)
- [Contributors](#Contributors)

### What does this backend?

This backend is focused on search movies with Name, Year, Type, Genre, and finally uses the name of the user to return a personalized message.

### How can I run it?

1. First, enter in /movie; then build the project with `./mvnw clean package -DskipTests`.
2. Second, run the backend with `./mvnw spring-boot:run`.

### Hown can I apply the requests?

1. Now the server is currently working in localhost in port 8080.
2. The path is `/api/movies/search`.
3. You need to send in JSON format the next data:
    {
      "nombreUsuario": "Sammy",
      "titulo": "Inception",
      "anio": "2010",
      "tipo": "Movie",
      "genero": "Science Fiction"
    }

### Contributors

|Aportantes    | Aportaciones                                                                                                                                             |
|--------------|----------------------------------------------------------------------------------------------------------------------------------------------------------|
| Diana        | FormService (lectura de JSON y filtros con Streams), Creacion del registro o almacen de peliculas (Peliculas.json), ajustes en pom.xml para dependencias |
| Sammy        | Contruccion DTO (Pelicula, BusquedaRequest y BusquedaResponse), Creacion de FormController y exposicion del endpoint por POST                            |