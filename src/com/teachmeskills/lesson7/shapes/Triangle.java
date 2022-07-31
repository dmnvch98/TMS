package com.teachmeskills.lesson7.shapes;

public class Triangle extends Shape {
    public Triangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    public Triangle() {
        super();
    }

    @Override
    public double calculateSquare() {
        double semiPerimeter = calculatePerimeter() / 2;
        return Math.ceil(
                Math.sqrt(
                        semiPerimeter * (semiPerimeter - getSideA()) *
                                (semiPerimeter - getSideB()) *
                                (semiPerimeter - getSideC())) *
                        getScale()) / getScale();
    }

    @Override
    public double calculatePerimeter() {
        return Math.ceil(
                (getSideA() + getSideB() + getSideC()) *
                        getScale()) / getScale();
    }
}
