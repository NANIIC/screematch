package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        //crea nueva instancia -new espacio en la memory para almacenar datos dentro de ese objeto (encapsula
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.evalua(6);
        var peliculaDeBruno= new Pelicula("El señor de los anillos", 2001);
       peliculaDeBruno.evalua(7);
        Serie casaDragon = new Serie("La casa del dragon", 2022);
        Serie lost = new Serie("Lost", 2000);

        Pelicula p1 = miPelicula;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(peliculaDeBruno);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(casaDragon);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println("Nombre: " + item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){
                System.out.println("Calificación: "+pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darín");
        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas); //Ordena el Array con metodo estatico sort
        System.out.println("Lista de artistas ordenada: "+ listaDeArtistas);

        Collections.sort(lista); //para ordenarlo usamos el for en linea 32
        System.out.println("Lista de titulos ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: "+lista);
    }
}
