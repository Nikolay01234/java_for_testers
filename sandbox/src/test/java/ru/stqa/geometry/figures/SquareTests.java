package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {
    @Test
    void canCalculateArea() {
        var s = new Square(4.0);
        double result = s.area();
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(20.0, new Square(5.0).perimeter());
    }

    @Test
    void cannotCreateSquareWithNegativeSide() {
        try {
            new Square(-5.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //OK
        }
    }




    @Test
    void canCalculateTrianglePerimetr() {
        // var принимает тип значения переменной, значение которой было написано после знака =
        // создали экземпляр класса tp
        // при этом передали параметры
        var tp = new Triangle(6.0, 7.0, 8.0);
        double result = tp.perimetrTriangle();
        Assertions.assertEquals(result, new Triangle(6.0, 7.0, 8.0).perimetrTriangle());
    }

    @Test
    void canCalculateTriangleSquare() {
        var ts = new Triangle(6.0, 7.0, 8.0);
        double result = ts.squareTriangle();
        Assertions.assertEquals(result, new Triangle(6.0, 7.0, 8.0).squareTriangle());
    }

    @Test
    void canCalculateCirclePerimetr() {
        var cp = new Circle(3.0);
        double result = cp.perimetrCircle();
        Assertions.assertEquals(result, new Circle(3.0).perimetrCircle());
    }

    @Test
    void canCalculateCircleSquare() {
        var cs = new Circle(4.0);
        double result = cs.scuareCircle();
        Assertions.assertEquals(result, new Circle(4.0).scuareCircle());
    }

}
