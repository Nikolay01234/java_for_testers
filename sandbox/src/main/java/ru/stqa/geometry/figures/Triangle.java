package ru.stqa.geometry.figures;

public class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public static void printTrianglePerimetr(Triangle t) {
        String text = String.format("Периметр треугольника со сторонами %f %f %f = %f", t.sideA, t.sideB, t.sideC, t.perimetrTriangle());
        System.out.println(text);
    }

    public static void printTriangleSquare(Triangle t) {
        String text = String.format("Площадь треугольника со сторонами %f %f %f = %f", t.sideA, t.sideB, t.sideC, t.squareTriangle());
        System.out.println(text);
    }

    // создали через TDD
    public double squareTriangle() {
        double perimetr = this.sideA + this.sideB + this.sideC;
        double halfOfThePerimeter = perimetr/2;
        double square = Math.sqrt(halfOfThePerimeter*(halfOfThePerimeter-this.sideA)*(halfOfThePerimeter-this.sideB)*(halfOfThePerimeter-this.sideC));
        return square;
    }

    public double perimetrTriangle() {
        return this.sideA + this.sideB + this.sideC;
    }
}
