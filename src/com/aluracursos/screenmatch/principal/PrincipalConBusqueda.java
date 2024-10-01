package com.aluracursos.screenmatch.principal;

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
        String direccion = "https://www.omdbapi.com/?t=" + busqueda + "&apikey=5e1f9cb7";

       //nosotros somos el cliente
        HttpClient client = HttpClient.newHttpClient();
        //que le pedimos
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
