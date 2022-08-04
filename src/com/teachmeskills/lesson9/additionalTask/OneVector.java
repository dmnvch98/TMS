package com.teachmeskills.lesson9.additionalTask;

import com.teachmeskills.lesson9.mainTask.*;

import static com.teachmeskills.lesson9.VectorUtils.roundNumber;

public final class OneVector {
    private final double[] coordinates = new double[3];
    public static String threeDecimalVectorDescription = "ThreeDecimalVector: ";
    public static String twoDecimalVectorDescription = "TwoDecimalVector: ";
    private boolean isThreeDecimalVector;

    public OneVector(double x, double y, double z) {
        this.coordinates[0] = x;
        this.coordinates[1] = y;
        this.coordinates[2] = z;
        isThreeDecimalVector = true;
    }

    public OneVector(double x, double y) {
        this.coordinates[0] = x;
        this.coordinates[1] = y;
        this.coordinates[2] = 0;
        isThreeDecimalVector = false;
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
        isThreeDecimalVector = true;
        coordinates[2] = z;
    }

    public double length() {
        return roundNumber(Math.sqrt((getX() * getX()) + (getY() * getY()) + (getZ() * getZ())));
    }

    public double scalarProduct(OneVector vector) {
        return roundNumber((this.getX() * vector.getX()) +
                (this.getY() * vector.getY()) +
                (this.getZ() * vector.getZ()));
    }

    public ThreeDecimalVector sum(OneVector vector) {
        return new ThreeDecimalVector((this.getX() + vector.getX()),
                (this.getY() + vector.getY()),
                (this.getZ() + vector.getZ()));
    }

    public ThreeDecimalVector minus(OneVector vector) {
        return new ThreeDecimalVector((this.getX() - vector.getX()),
                (this.getY() - vector.getY()),
                (this.getZ() - vector.getZ()));
    }

    private String printVectorInfo() {
        return isThreeDecimalVector ? threeDecimalVectorDescription + "x = " + getX() + " ,y =" + getY() + ", z =" + getZ()
                : twoDecimalVectorDescription + "x = " + getX() + " ,y =" + getY();
    }

    @Override
    public String toString() {
        return printVectorInfo();
    }
}
