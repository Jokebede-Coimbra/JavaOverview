package com.jkbd.colecoes.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Double {
    public static void main(String[] args) {
        // Dobrar os Números

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> doubled = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(doubled);


    }
}
