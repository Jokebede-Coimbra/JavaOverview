package com.jkbd.programacaofuncionalexpressoeslambda.function.entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // Reference method com método estático
    public static String staticUpperCaseName(Product p) {
        return p.getName().toUpperCase();
    }

    // V3 : Reference method com método não estático
    public String nonStaticUpperCaseName() {
        return nonStaticUpperCaseName();
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
