package com.jkbd.streams.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        var items = new ArrayList<String>();
        items.add("computador");
        items.add("teclado");
        items.add("mouse");

        for (String item : items) {
            if (item.startsWith("m"))
                System.out.println(item);
        }
// ==========================================================================
        // Stream - filtragem, ordenação, transformação....
        items.stream()
                .filter(x -> x.startsWith("m")) // intermediarias
                .map(String::toUpperCase) // intermediarias
                .forEach(System.out::println); // terminais
// ==========================================================================
        // foreach, collect, reduce
        var listaModificada = items.stream()
                .filter(x -> x.startsWith("m")) // intermediarias
                .map(String::toUpperCase) // intermediarias
                .collect(Collectors.toList()); // terminal

        System.out.println(listaModificada);
// ==========================================================================
        var numeros = List.of(1, 2, 3 ,4);

        var soma = numeros.stream().reduce(0, Integer::sum);
        System.out.println(soma);
// ==========================================================================
        items.parallelStream().forEach(item -> System.out.println(Thread.currentThread() + " - " + item));
    }
}
