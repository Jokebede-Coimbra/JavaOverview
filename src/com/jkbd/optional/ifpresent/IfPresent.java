package com.jkbd.optional.ifpresent;

import java.util.Optional;

public class IfPresent {
    public static void main(String[] args) {

        Optional<String> frutaOptional = Optional.of("Melancia");

        frutaOptional.ifPresent(f -> System.out.println("Fruta Presente: " + f));
    }
}
