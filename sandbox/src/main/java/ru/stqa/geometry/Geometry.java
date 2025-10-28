package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(new Square(7.0));
        Square.printSquareArea(new Square(5.0));
        Square.printSquareArea(new Square(3.0));

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(7.0, 9.0);

        Triangle.printTrianglePerimetr(new Triangle(3.0, 4.0, 5.0));
        Triangle.printTrianglePerimetr(new Triangle(6.0, 7.0, 8.0));

        Triangle.printTriangleSquare(new Triangle(3.0, 4.0, 5.0));
        Triangle.printTriangleSquare(new Triangle(6.0, 7.0, 8.0));
    }

}
