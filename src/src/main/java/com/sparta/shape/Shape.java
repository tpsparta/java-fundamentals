package com.sparta.shape;

public abstract class Shape {

    @Override
    public String toString() {

        return String.valueOf(calculateArea());

    }

   abstract public double calculateArea();

}
