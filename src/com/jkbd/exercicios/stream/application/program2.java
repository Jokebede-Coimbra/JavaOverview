package com.jkbd.exercicios.stream.application;

import com.jkbd.programacaofuncionalexpressoeslambda.predicate.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class program2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> list = br.lines()
                    .map(line -> line.split(","))
                    .map(fields -> new Product(fields[0], Double.parseDouble(fields[1])))
                    .collect(Collectors.toList());

            double avg = list.stream()
                    .mapToDouble(Product::getPrice)
                    .average()
                    .orElse(0.0);

            System.out.println("Average price: " + String.format("%.2f", avg));

            list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(Product::getName)
                    .sorted(Comparator.comparing((String s) -> s.toUpperCase(Locale.ROOT)).reversed())
                    .forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
