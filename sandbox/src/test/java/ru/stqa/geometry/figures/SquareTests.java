package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {
    @Test
    void canCalculateArea() {
        var s = new Square(5.0);
        double result = s.area();
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(20.0, new Square(5.0).perimeter());
    }


    @Test
    void canCalculateTrianglePerimetr() {
        var tp = new Triangle(6.0, 7.0, 8.0);
        double result = tp.perimetrTriangle();
        Assertions.assertEquals(21, new Triangle(6.0, 7.0, 8.0).perimetrTriangle());

    }

    @Test
    void canCalculateTriangleSquare() {
        var ts = new Triangle(6.0, 7.0, 8.0);
        double result = ts.squareTriangle();
        Assertions.assertEquals(20.33316256758894, new Triangle(6.0, 7.0, 8.0).squareTriangle());
    }
}
