package com.jkbd.colecoes.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Word {
    public static void main(String[] args) {
        // Filtrar Strings por Comprimento
        List<String> fruits = Arrays.asList("apple", "is", "a", "fruit");

        List<String> filteredFruits = fruits.stream()
                .filter(w -> w.length() > 3)
                .collect(Collectors.toList());


        System.out.println(filteredFruits);

    }
}
