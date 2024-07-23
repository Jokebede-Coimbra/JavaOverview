package com.jkbd.programacaofuncionalexpressoeslambda.function.util;

import com.jkbd.programacaofuncionalexpressoeslambda.function.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {


    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
