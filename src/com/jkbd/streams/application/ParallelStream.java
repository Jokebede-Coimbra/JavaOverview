package com.jkbd.streams.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {

        // Criar uma lista de 10 milhões de inteiros
        List<Integer> numbers = new ArrayList<>();
        IntStream.range(0, 10_000_000).forEach(numbers::add);

        // Testando o stream sequencial
        long startTime = System.currentTimeMillis();
        long sumSequential = numbers.stream()
                .mapToLong(Integer::longValue)  // Usando long para evitar overflow
                .sum();
        long endTime = System.currentTimeMillis();
        System.out.println("Soma (stream): " + sumSequential);
        System.out.println("Tempo gasto com stream: " + (endTime - startTime) + " ms");

        // Testando o parallelStream
        startTime = System.currentTimeMillis();
        long sumParallel = numbers.parallelStream()
                .mapToLong(Integer::longValue) 
                .sum();
        endTime = System.currentTimeMillis();
        System.out.println("Soma (parallelStream): " + sumParallel);
        System.out.println("Tempo gasto com parallelStream: " + (endTime - startTime) + " ms");

    }
}
