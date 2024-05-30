package com.jkbd.colecoes.desafios;

import java.util.Arrays;
import java.util.List;

public class Bigger {
    public static void main(String[] args) {
        // Encontrar o Maior Número

        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 10);

        int max = numbers.stream()
                .max(Integer::compare)
                .orElseThrow(() -> new IllegalArgumentException("Lista vazia"));

        System.out.println(max);


    }
}
