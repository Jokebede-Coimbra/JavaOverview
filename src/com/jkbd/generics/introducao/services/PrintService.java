package com.jkbd.generics.introducao.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    private List<T> lists = new ArrayList<>();

    public void addValue(T value) {

        lists.add(value);
    }

    public T first() {
        if (lists.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return lists.get(0);
    }

    public void print() {
        System.out.print("[");
        if (!lists.isEmpty()) {
            System.out.print(lists.get(0));
        }

        for (int i = 1; i < lists.size(); i++) {
            System.out.print(", " + lists.get(i));
        }

        System.out.println("]");
    }

}
