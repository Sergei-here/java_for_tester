package ru.stqa.geometry.figures;

import static java.lang.Math.sqrt;

public class Triangle {
    public static void printTriangleArea(double a, double b, double c) {
        String text1 = String.format("Площадь треугольника со сторонами %f и %f и %f = %f", a, b, c, TriangleArea(a, b, c));
        System.out.println(text1);

        String text2 = String.format("Периметр треугольника со сторонами %f и %f и %f = %f", a, b, c, TrianglePerimeter(a, b, c));
        System.out.println(text2);

    }

    private static double TrianglePerimeter(double a, double b, double c) {
        return (a+b+c);
    }

    public static double TriangleArea(double a, double b, double c) {
        return sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
    }
}
