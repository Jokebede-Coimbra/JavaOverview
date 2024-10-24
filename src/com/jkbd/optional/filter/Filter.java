package com.jkbd.optional.filter;

import java.util.Optional;

public class Filter {
    public static void main(String[] args) {

        Optional<String> fruta = Optional.of("Maçã");

        Optional<String> frutaFiltrada = fruta.filter(f -> f.equals("Maçã"));
        System.out.println(frutaFiltrada.orElse("Valor não corresponde"));

        Optional<String> frutaFiltrada2 =  fruta.filter(f -> f.equals(("Uva")));
        System.out.println(frutaFiltrada2.orElse("Valor não corresponde"));
    }
}
