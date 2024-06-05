package com.jkbd.interfaces.comparable.application;

import com.jkbd.interfaces.comparable.entities.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", 25));
        pessoas.add(new Pessoa("Carlos", 30));
        pessoas.add(new Pessoa("Bruno", 22));

        System.out.println("Antes de ordenar: " + pessoas);

        Collections.sort(pessoas);

        System.out.println("Depois de ordenar: " + pessoas);
    }

}
