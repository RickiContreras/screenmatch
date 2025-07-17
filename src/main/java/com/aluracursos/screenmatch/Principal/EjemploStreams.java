package com.aluracursos.screenmatch.Principal;

import java.util.Arrays;
import java.util.List;

public class EjemploStreams {
    public void muestraEjemplo(){
        List<String> nombres = Arrays.asList("Enrique", "Maria", "Zulema", "Sole", "Valeria");

        nombres.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
