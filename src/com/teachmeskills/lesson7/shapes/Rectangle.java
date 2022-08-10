package com.teachmeskills.lesson7.shapes;

public class Rectangle extends Shape {
    public Rectangle(double width, double height) {
        super(width, height);
    }

    public Rectangle() {
        super();
    }

    @Override
    public double calculateSquare() {
        return Math.ceil(
                getSideA() * getSideB() *
                        getScale()) / getScale();
    }

    @Override
    public double calculatePerimeter() {
        return Math.ceil(
                (getSideB() + getSideA()) * 2 *
                        getScale()) / getScale();
    }
}
