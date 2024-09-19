import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula(); //crea nueva instancia -new espacio en la memory para almacenar datos dentro de ese objeto (encapsula
        miPelicula.nombre ="Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;

        miPelicula.muestraFichaTernica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        //para ver el total de las evaluaciones ponemos get..
        System.out.println(miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMedia());










//        com.aluracursos.screenmatch.modelos.Pelicula otraPelicula = new  com.aluracursos.screenmatch.modelos.Pelicula();
//        otraPelicula.nombre = "Matrix";
//        otraPelicula.fechaDeLanzamiento = 1998;
//        otraPelicula.duracionEnMinutos = 180;
//        otraPelicula.muestraFichaTernica();

    }
}
