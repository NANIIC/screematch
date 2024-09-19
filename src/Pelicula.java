public class Pelicula {
   String nombre;
   int fechaDeLanzamiento;
   int duracionEnMinutos;
   boolean incluidoEnElPlan;
   double sumaDeLasEvaluaciones;
   int totalDeEvaluaciones;

   void muestraFichaTernica(){
      System.out.println("El nombre de la película es: " + nombre  );
      System.out.println("Su fecha de lanzamiento es: "+ fechaDeLanzamiento);
      System.out.println("Duración en minutos: " + duracionEnMinutos);


   }
   void evalua(double nota){
      sumaDeLasEvaluaciones += nota;
      totalDeEvaluaciones ++;
   }
   //en esta nueva nos va a dar error hasta que agreguemos return- en void no
   double calculaMedia(){
      return sumaDeLasEvaluaciones / totalDeEvaluaciones;
   }
}
