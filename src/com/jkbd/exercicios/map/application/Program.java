package com.jkbd.exercicios.map.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // D:\\Java2024\\Udemy-Nelio\\temp\\in.txt
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader((new FileReader(path)))) {

            String line = bufferedReader.readLine();
            while (line != null) {

                String[] fields = line.split(",");

                String nome = fields[0];
                Integer votes = Integer.parseInt(fields[1]);

              /* if (map.get(nome) == null) {
                    map.put(nome, votes);
                } else {
                    map.put(nome, votes + map.get(nome));
                }*/
                map.merge(nome, votes, Integer::sum);

                line = bufferedReader.readLine();
            }

            for (String key : map.keySet()) {
                System.out.println(key + ":  " + map.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
