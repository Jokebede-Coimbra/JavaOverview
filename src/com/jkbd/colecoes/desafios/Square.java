package com.jkbd.colecoes.desafios;

import java.util.Arrays;
import java.util.List;

public class Square {
    public static void main(String[] args) {

        // Soma dos Quadrados dos Números Ímpares


        List<Integer> square = Arrays.asList(1, 2, 3, 4, 5);

        int sumOfSquares = square.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(sumOfSquares);

    }
}
