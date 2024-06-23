package com.jkbd.generics.curingasdelimitados.application;


import com.jkbd.generics.curingasdelimitados.entities.Circle;
import com.jkbd.generics.curingasdelimitados.entities.Rectangle;
import com.jkbd.generics.curingasdelimitados.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);


        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2.0));
        shapes.add(new Rectangle(3.0, 4.0));

        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(2.0));
        circles.add(new Circle(3.0));
        //System.out.println("Total area: " + String.format("%.2f", totalArea(shapes)));
        System.out.println("Total area: " + String.format("%.2f", totalArea(circles)));

    }

    // Essa lista pode ser de Shape ou qualquer tipo que seja um subtipo de Shape
    // Porém, não posso adicionar elementos na lista, pode não ser compativel >>  lis.add(new Retancle(3.0,4.0), por exemplo. Se a minha lista é de circulo não posso add uma lista de retangulo e virce-versa ;
    public static double totalArea(List<? extends Shape> list) {

        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }

        return sum;
    }
}
