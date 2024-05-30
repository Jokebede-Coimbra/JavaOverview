package com.jkbd.colecoes.desafios;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class Fruit {

    public static void main(String[] args) {

        // Transformar e Filtrar
        List<String> fruits = Arrays.asList("Banana", "Apple", "Cherry", "Date");

        List<String> filtersFruit = fruits.stream()
                .map(String::toLowerCase)
                .filter(f -> f.contains("a"))
                .collect(Collectors.toList());

        System.out.println(filtersFruit);
    }

}
