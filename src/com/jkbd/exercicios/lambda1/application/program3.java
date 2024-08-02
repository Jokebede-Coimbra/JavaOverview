package com.jkbd.exercicios.lambda1.application;

import com.jkbd.programacaofuncionalexpressoeslambda.predicate.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class program3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double avg = calculateAveragePrice(list);
            System.out.println("Average price: " + String.format("%.2f", avg));

            List<String> names = findProductNamesBelowAverage(list, avg);
            names.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

    private static double calculateAveragePrice(List<Product> products) {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.0);
    }

    private static List<String> findProductNamesBelowAverage(List<Product> products, double averagePrice) {
        return products.stream()
                .filter(p -> p.getPrice() < averagePrice)
                .map(Product::getName)
                .sorted(Comparator.comparing((String s) -> s.toUpperCase(Locale.ROOT)).reversed())
                .collect(Collectors.toList());
    }
}
