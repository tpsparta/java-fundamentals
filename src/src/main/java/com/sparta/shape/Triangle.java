package com.sparta.shape;

public class Triangle extends Shape {

    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return this.side * this.side;
    }

}
