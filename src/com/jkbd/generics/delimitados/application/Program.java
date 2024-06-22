package com.jkbd.generics.delimitados.application;

import com.jkbd.generics.delimitados.entities.Product;
import com.jkbd.generics.delimitados.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        String path = "D:\\Java2024\\Udemy-Nelio\\temp\\in.txt";

        try (
                BufferedReader br = new BufferedReader(new FileReader(path))) { // abro o arquivo
            String line = br.readLine(); // Ler todos

            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1]))); // varrendo os arquivos e armazenando todos os produtos na lista
                line = br.readLine();
            }

            Product x = CalculationService.max(list); // responsável por encontrar o maior elemento na lista e retonar
            System.out.println("Most expensive: ");
            System.out.println(x);

        } catch (
                IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
