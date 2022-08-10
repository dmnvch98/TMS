package com.teachmeskills.lesson9.mainTask;

import static com.teachmeskills.lesson9.VectorUtils.*;

public abstract class Vector implements Vectorable {
    public final static String MORE_THEN = " больше чем ";
    public final static String LESS_THEN = " меньше чем ";

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Vector() {
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double length() {
        return roundNumber(Math.sqrt((getX() * getX()) + (getY() * getY()) + (getZ() * getZ())));
    }

    double scalarProduct(Vector vector) {
        return roundNumber((this.getX() * vector.getX()) +
                (this.getY() * vector.getY()) +
                (this.getZ() * vector.getZ()));
    }

    public String compare(Vector vector) {
        return this.length() > vector.length() ? this + MORE_THEN + vector : this + LESS_THEN + vector;
    }
}
