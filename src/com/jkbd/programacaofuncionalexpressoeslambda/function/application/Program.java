package com.jkbd.programacaofuncionalexpressoeslambda.function.application;

import com.jkbd.programacaofuncionalexpressoeslambda.function.entities.Product;
import com.jkbd.programacaofuncionalexpressoeslambda.function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        names.forEach(System.out::println);

        // V2: Reference method com método estático
        List<String> namesV2 = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        namesV2.forEach(System.out::println);

        // V3 : Reference method com método não estático
        List<String> namesV3 = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        namesV3.forEach(System.out::println);

        // Expressão lambda declarada
        Function<Product, String> func = product -> product.getName().toLowerCase();

        List<String> namesV4 = list.stream().map(func).collect(Collectors.toList());

        namesV4.forEach(System.out::println);

        // Expressão lambda inline
        List<String> namesV5 = list.stream().map(product -> product.getName().toLowerCase()).collect(Collectors.toList());

        namesV5.forEach(System.out::println);
    }
}