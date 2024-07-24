package com.jkbd.programacaofuncionalexpressoeslambda.function.parametro.application;

import com.jkbd.programacaofuncionalexpressoeslambda.function.entities.Product;
import com.jkbd.programacaofuncionalexpressoeslambda.function.parametro.util.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'H');
        // double sum = ps.filteredSum(list, p -> p.getPrice() < 100.0);

        System.out.println("Sum = " + String.format("%.2f", sum));
    }

}