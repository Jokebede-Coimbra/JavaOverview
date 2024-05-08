package com.jkbd.metodosabstratos.application;

import com.jkbd.metodosabstratos.entities.Circle;
import com.jkbd.metodosabstratos.entities.Rectangle;
import com.jkbd.metodosabstratos.entities.Shape;
import com.jkbd.metodosabstratos.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data: ");
            System.out.println("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.println("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.println("Width: ");
                Double width = sc.nextDouble();
                System.out.println("Height: ");
                Double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.println("Radius: ");
                Double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }

        }
        System.out.println("SHAPE AREAS");
        for (Shape shap : list) {
            System.out.println(String.format("%.2f",shap.area()));

        }

    }
}
