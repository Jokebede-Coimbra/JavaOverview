package com.jkbd.colecoes.exemplo3;

import java.util.Arrays;
import java.util.List;


public class Word {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("stream", "filter", "map", "reduce", "collect", "concatenate");

        long count = words.stream()
                .filter(word -> word.length() > 5)
                .count();

        System.out.println("Número de palavras com mais de 5 caracteres: " + count);


    }
}

