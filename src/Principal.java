public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula(); //crea nueva instancia -new espacio en la memory para almacenar datos dentro de ese objeto (encapsula
        miPelicula.nombre ="Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;

        System.out.println("Mi película es: " + miPelicula.nombre  );
        System.out.println("Su fecha de lanzamiento es: "+ miPelicula.fechaDeLanzamiento);

        Pelicula otraPelicula = new  Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1998;
        otraPelicula.duracionEnMinutos = 180;

        System.out.println("Mi película es: " + otraPelicula.nombre  );
        System.out.println("Su fecha de lanzamiento es: "+ otraPelicula.fechaDeLanzamiento);

    }
}
