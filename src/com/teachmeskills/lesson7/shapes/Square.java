package com.teachmeskills.lesson7.shapes;

public class Square extends Shape {
    public Square(double radius) {
        super(radius);
    }

    public Square() {
        super();
    }

    @Override
    public double calculateSquare() {
        return Math.ceil(
                getSideC() * getSideC() * Math.PI *
                        getScale()) / getScale();
    }

    @Override
    public double calculatePerimeter() {
        return Math.ceil(
                (2 * Math.PI * getSideC()) *
                        getScale()) / getScale();
    }
}
