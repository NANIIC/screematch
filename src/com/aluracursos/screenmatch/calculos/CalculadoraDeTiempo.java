package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

//siempre fijarse que tenga la importacion de los recursos
public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

}
