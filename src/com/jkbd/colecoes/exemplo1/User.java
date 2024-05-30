package com.jkbd.colecoes.exemplo1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class User {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jayanne", "Samarah", "Jacson", "Josué");

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}

