package com.jkbd.programacaofuncionalexpressoeslambda.consumer.util;

import com.jkbd.programacaofuncionalexpressoeslambda.consumer.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }

    @Override
    public Consumer<Product> andThen(Consumer<? super Product> after) {
        return Consumer.super.andThen(after);
    }
}
