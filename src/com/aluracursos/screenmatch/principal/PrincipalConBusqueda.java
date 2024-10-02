package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.excepcion.ErrorEnConversionDeDuracionExeption;
import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el nombre de la película");
        var busqueda = lectura.nextLine();
        // el link sin el nombre de la peli, sumamos el nombre de lo que busca la persona y más nuestra apikey
        String direccion = "https://www.omdbapi.com/?t=" + busqueda.replace(" ","+") //Hacemos esto de reemplazar porque ya sabemos cuál es el problema
                + "&apikey=" + "5e1f9cb7";
        try{
            //nosotros somos el cliente
            HttpClient client = HttpClient.newHttpClient();
            //que le pedimos
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder().
                    setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(miTituloOmdb);


            Titulo miTitulo = new Titulo(miTituloOmdb);
            System.out.println("Titulo ya convertido: "+miTitulo);
            //Entradas y salidas a mi pc
            FileWriter escritura = new FileWriter("peliculas.txt");
            escritura.write(miTitulo.toString());
            escritura.close(); //muy importante cerrar la conexion
        }catch (NumberFormatException e){
            System.out.println("Ocurrió un error: ");
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Error en la URI, verifique la dirección");
        }catch (ErrorEnConversionDeDuracionExeption e){
            System.out.println(e.getMessage());
        }
        System.out.println("Finalizo la ejecución del programa!");

    }
}
