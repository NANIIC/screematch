import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021); //crea nueva instancia -new espacio en la memory para almacenar datos dentro de ese objeto (encapsula
        miPelicula.setDuracionEnMinutos(120);
        System.out.println("Duración de la película: " + miPelicula.getDuracionEnMinutos());

        miPelicula.muestraFichaTernica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        //para ver el total de las evaluaciones ponemos get..
        System.out.println(miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie("La casa del dragon", 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporadas(10);
        casaDragon.muestraFichaTernica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Serie lost = new Serie("Lost", 2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpisodio(50);
        lost.muestraFichaTernica();
        System.out.println(lost.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos estas vacaciones: "
                +calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);

        var peliculaDeBruno= new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.setDuracionEnMinutos(180);

        //adentro <> nos dice el tipo de array
        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);
        
        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera película es: " + listaDePeliculas.get(0).getNombre());
        // listaDePeliculas.get(0) nos da la pelicula dentro del array
        //.getNombre() nos da el nombre de la peli que esta dentro de Titulo
        // listaDePeliculas.size() nos da el tamaño del array

        //imprimir el array
        System.out.println(listaDePeliculas.toString());
        System.out.println("toString de la película: " + listaDePeliculas.get(0).toString());

    }
}
