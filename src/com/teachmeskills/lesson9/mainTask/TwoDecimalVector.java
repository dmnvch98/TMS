package com.teachmeskills.lesson9.mainTask;

public class TwoDecimalVector extends Vector {
    public static String description = "TwoDecimalVector: ";

    public TwoDecimalVector(double x, double y) {
        super(x, y);
    }

    @Override
    public Vector sum(Vector vector) {
        return new TwoDecimalVector((this.getX() + vector.getX()), (this.getY() + vector.getY()));
    }

    @Override
    public Vector minus(Vector vector) {
        return new TwoDecimalVector((this.getX() - vector.getX()), (this.getY() - vector.getY()));
    }

    @Override
    public String toString() {
        return description + "x = " + getX() + ", y = " + getY();
    }
}
