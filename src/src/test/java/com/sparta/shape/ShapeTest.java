package com.sparta.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShapeTest {

    @Test
    @DisplayName("Circle test")
    public void test_1()
    {
        Circle c = new Circle(12.0);

        Assertions.assertEquals(452.3893421169302, c.calculateArea());
    }

    @Test
    @DisplayName("Square test")
    public void test_2()
    {
        Square c = new Square(8.0);

        Assertions.assertEquals(64.0, c.calculateArea());
    }

}
