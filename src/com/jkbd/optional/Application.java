package com.jkbd.optional;

import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        // Criando um Optional com valor presente
        Optional<String> optional = Optional.of("Uva");
        System.out.println(optional.get());

        // Criando um Optional com valor ausente
        Optional<String> optionalAusente = Optional.ofNullable(null);
        System.out.println(optionalAusente.isPresent());

        // Tratando valor ausente com orElse
        Optional<String> optionalValorPadrao = Optional.ofNullable(null);
        System.out.println(optionalValorPadrao.orElse("Valor padrão"));
    }
}
