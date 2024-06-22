package com.jkbd.generics.delimitados.services;

import java.util.List;

public class CalculationService {

    public static <T extends Comparable<? super T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0); // maior de uma lista
        for (T item : list) {
            if (item.compareTo(max) > 0) { // cada item compara com o max e maior que 0
                max = item;
            }
        }
        return max;
    }
}
