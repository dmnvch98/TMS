package com.teachmeskills.lesson9.additionalTask;

public final class OneVector {
    private double[] coordinates = new double[3];

    public OneVector(double[] coordinates) {
        this.coordinates = coordinates;
    }

    public OneVector() {
    }

    public double getX() {
        return coordinates[0];
    }

    public double getY() {
        return coordinates[1];
    }

    public double getZ() {
        return coordinates[2];
    }

    public void setX(int x) {
        coordinates[0] = x;
    }

    public void setY(double y) {
        coordinates[1] = y;
    }

    public void setZ(double z) {
        coordinates[2] = z;
    }
}
