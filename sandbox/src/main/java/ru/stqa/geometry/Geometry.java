package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;

import static java.lang.Math.sqrt;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea (new Square(7.0));
        Square.printSquareArea (new Square(5.0));
        Square.printSquareArea (new Square(3.0));

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(7.0, 9.0);

        printTriangleArea (2.0, 3.0, 4.0);
    
    }
    static void printTriangleArea (double a, double b, double c) {
        System.out.println("Площадь треугольника со сторонами " + a + " и " + b + " и "  + c + " = " + TriangleArea(a, b, c));

        System.out.println("Периметр треугольника со сторонами " + a + " и " + b + " и "  + c + " = " + TrianglePerimeter(a, b, c));

    }

    private static double TrianglePerimeter(double a, double b, double c) {
        return (a+b+c);
    }


    private static double TriangleArea(double a, double b, double c) {
        return sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
    }
}
