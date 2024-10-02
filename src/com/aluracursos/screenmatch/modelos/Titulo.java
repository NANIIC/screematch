package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.excepcion.ErrorEnConversionDeDuracionExeption;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nombre;
    @SerializedName("Year")
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan; //true/false
    private double sumaDeLasEvaluaciones;
    private int totalDeEvaluaciones;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fechaDeLanzamiento = Integer.valueOf(miTituloOmdb.year());
        if (miTituloOmdb.runtime().contains("N/A")){
            throw new ErrorEnConversionDeDuracionExeption("No pude convertir la duración, "
            +" porque contiene un N/A");
        }
        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.runtime()
                .substring(0,3).replace(" ","")
        );

    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    //Setter para que el privado sirva en la otra clase porque esta en privado
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    //creamos metodo int, queremos que nos de algo entonces ponemos get
    //y nos sale autocompletar con la variable que queremos
    // recordar que los metodos int necesitan return
    public int getTotalDeEvaluaciones(){
        return totalDeEvaluaciones;
    }

    public void muestraFichaTernica(){
        System.out.println("El nombre de la película es: " + nombre  );
        System.out.println("Su fecha de lanzamiento es: "+ fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
    }
    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeEvaluaciones ++;
    }
    //en esta nueva nos va a dar error hasta que agreguemos return- en void no
    public double calculaMedia(){

        return sumaDeLasEvaluaciones / totalDeEvaluaciones;
    }
    //Compare los titulos para acomodarlos alfabéticamente
    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento +
                ", duración= "+duracionEnMinutos;
    }
}
