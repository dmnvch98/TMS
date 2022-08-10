package com.teachmeskills.lesson7.shapes;

import static com.teachmeskills.lesson7.Utils.print;

public abstract class Shape {
    private final static String INCORRECT_SIDES = "Введены некорректные стороны треугольника";
    private double sideA;
    private double sideB;
    private double sideC;

    private final double scale = Math.pow(10, 2);

    public Shape(double sideA, double sideB, double sideC) {
        if (ifTriangleValid(sideA, sideB, sideC)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            print(INCORRECT_SIDES);
        }

    }

    public Shape(double width, double height) {
        this.sideA = width;
        this.sideB = height;
    }

    public Shape(double radius) {
        this.sideC = radius;
    }

    public Shape() {

    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getScale() {
        return scale;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    abstract public double calculateSquare();

    abstract public double calculatePerimeter();

    private static boolean ifTriangleValid(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    @Override
    public String toString() {
        return "Периметр: " + calculatePerimeter() + " Площадь: " + calculateSquare();
    }
}
