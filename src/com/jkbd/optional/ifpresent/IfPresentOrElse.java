package com.jkbd.optional.ifpresent;

import java.util.Optional;

public class IfPresentOrElse {
    public static void main(String[] args) {

        Optional<String> optionalVazio = Optional.empty();

        optionalVazio.ifPresentOrElse(
                f -> System.out.println("Valor presente: " + f),
                () -> System.out.println("Valor ausente"));
    }
}
