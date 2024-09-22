import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula(); //crea nueva instancia -new espacio en la memory para almacenar datos dentro de ese objeto (encapsula
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTernica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        //para ver el total de las evaluaciones ponemos get..
        System.out.println(miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMedia());







//hola



//        Pelicula otraPelicula = new Pelicula();
//        otraPelicula.nombre= "Matrix";
//        otraPelicula.FechaDeLanzamiento= 1998;
//        otraPelicula.DuracionEnMinutos= 180;
//
//        otraPelicula.muestraFichaTernica():

    }
}
