package ru.stqa.geometry.figures;

import java.util.Objects;

import static java.lang.Math.sqrt;

public record Triangle(double a, double b, double c) {

    //public class Triangle {
        public static void printTriangleArea(double a, double b, double c) {

            String text1 = String.format("Площадь треугольника со сторонами %f и %f и %f = %f", a, b, c, TriangleArea(a, b, c));
            System.out.println(text1);

            String text2 = String.format("Периметр треугольника со сторонами %f и %f и %f = %f", a, b, c, TrianglePerimeter(a, b, c));
            System.out.println(text2);

        }

        private static double TrianglePerimeter(double a, double b, double c) {
            return (a + b + c);
        }

        public static double TriangleArea(double a, double b, double c) {
            return sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Double.compare(this.a, triangle.a) == 0 && Double.compare(this.b, triangle.b) == 0 && Double.compare(this.c, triangle.c) == 0)
                || (Double.compare(this.c, triangle.a) == 0 && Double.compare(this.b, triangle.b) == 0 && Double.compare(this.a, triangle.c) == 0) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}
