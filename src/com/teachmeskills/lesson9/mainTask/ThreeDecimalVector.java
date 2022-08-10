package com.teachmeskills.lesson9.mainTask;

import static com.teachmeskills.lesson9.VectorUtils.*;

public class ThreeDecimalVector extends Vector implements ThreeDecimalVectorable {
    public static String description = "ThreeDecimalVector";

    public ThreeDecimalVector(double x, double y, double z) {
        super(x, y, z);
    }

    public ThreeDecimalVector() {
    }

    @Override
    public ThreeDecimalVector sum(ThreeDecimalVector vector) {
        return new ThreeDecimalVector((this.getX() + vector.getX()),
                (this.getY() + vector.getY()),
                (this.getZ() + vector.getZ()));
    }

    @Override
    public ThreeDecimalVector minus(ThreeDecimalVector vector) {
        return new ThreeDecimalVector((this.getX() - vector.getX()),
                (this.getY() - vector.getY()),
                (this.getZ() - vector.getZ()));
    }

    public static Vector[] initVectorArray(int number) {
        Vector[] vectorArray = new ThreeDecimalVector[number];
        for (int i = 0; i < number; i++) {
            vectorArray[i] = new ThreeDecimalVector(randomNumber(), randomNumber(), randomNumber());
        }
        return vectorArray;
    }

    @Override
    public String toString() {
        return description + "x = " + getX() + ", y = " + getY() + ", z = " + getZ();
    }
}
