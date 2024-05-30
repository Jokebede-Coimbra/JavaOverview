package com.jkbd.colecoes.exemplo2;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;


public class Calculator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        OptionalDouble average = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .average();

        if (average.isPresent()) {
            System.out.println("Média dos números pares: " + average.getAsDouble());
        } else {
            System.out.println("Não há números pares na lista.");
        }

    }
}

