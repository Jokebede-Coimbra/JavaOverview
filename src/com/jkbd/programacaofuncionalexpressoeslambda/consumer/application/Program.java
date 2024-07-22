package com.jkbd.programacaofuncionalexpressoeslambda.consumer.application;

import com.jkbd.programacaofuncionalexpressoeslambda.consumer.entities.Product;
import com.jkbd.programacaofuncionalexpressoeslambda.consumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.forEach(new PriceUpdate());

        list.forEach(System.out::println);

        // V2: Reference method com método estático
        list.forEach(Product::staticPriceUpdate);

        // V3 : Reference method com método não estático
        list.forEach(Product::nonStaticPriceUpdate);

        // Expressão lambda declarada
        double factor = 1.1;
        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
        list.forEach(cons);

        // Expressão lambda inline
        list.forEach(p -> p.setPrice(p.getPrice() * factor));
    }
}