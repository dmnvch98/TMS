package com.teachmeskills.lesson9.mainTask;

import static com.teachmeskills.lesson9.VectorUtils.randomNumber;

public class TwoDecimalVector extends Vector implements TwoDecimalVectorable{
    public static String description = "TwoDecimalVector: ";

    public TwoDecimalVector(double x, double y) {
        super(x, y);
    }

    @Override
    public TwoDecimalVector sum(TwoDecimalVector vector) {
        return new TwoDecimalVector((this.getX() + vector.getX()), (this.getY() + vector.getY()));
    }

    @Override
    public TwoDecimalVector minus(TwoDecimalVector vector) {
        return new TwoDecimalVector((this.getX() - vector.getX()), (this.getY() - vector.getY()));
    }

    public static Vector[] initVectorArray(int number) {
        Vector[] vectorArray = new TwoDecimalVector[number];
        for (int i = 0; i < number; i++) {
            vectorArray[i] = new TwoDecimalVector(randomNumber(), randomNumber());
        }
        return vectorArray;
    }

    @Override
    public String toString() {
        return description + "x = " + getX() + ", y = " + getY();
    }
}
