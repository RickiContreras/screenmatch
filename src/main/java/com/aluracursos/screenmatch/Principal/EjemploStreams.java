package com.aluracursos.screenmatch.Principal;

import java.util.Arrays;
import java.util.List;

public class EjemploStreams {
    public void muestraEjemplo(){
        List<String> nombres = Arrays.asList("Enrique", "Zulema", "Maria", "Sole", "Valeria");

        nombres.stream()
                .sorted()
                .limit(5)
                .filter(n -> n.contains("a"))
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);
    }
}
