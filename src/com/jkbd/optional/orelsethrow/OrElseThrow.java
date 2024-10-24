package com.jkbd.optional.orelsethrow;

import java.util.Optional;

public class OrElseThrow {
    public static void main(String[] args) {

        Optional<String> optionalComValor = Optional.of("Laranja");
        Optional<String> optionalSemValor = Optional.empty();

        System.out.println(optionalComValor.orElseThrow());
        System.out.println(optionalSemValor.orElseThrow(() -> new IllegalArgumentException("Valor ausente")));
    }
}
