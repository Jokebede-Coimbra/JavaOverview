package com.jkbd.optional.colecoes;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Colecao {
    public static void main(String[] args) {

        List<String> frutas = Arrays.asList("Maçã", "Banana", "Pêra");

    // Encontrar a primeira fruta que contém a letra "a"
        Optional<String> frutaComA = frutas.stream()
                .filter(f -> f.contains("a"))
                .findFirst();

        System.out.println(frutaComA.orElse("Nenhuma fruta encontrada"));

    }
}
