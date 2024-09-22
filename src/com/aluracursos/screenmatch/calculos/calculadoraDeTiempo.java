package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.modelos.Pelicula;
//siempre fijarse que tenga la importacion de los recursos
public class calculadoraDeTiempo {
    private int tiempoTotal;

    public void incluye(Pelicula pelicula){
        tiempoTotal += pelicula.getDuracionEnMinutos();
    }
}
