package com.teachmeskills.lesson9;

import com.teachmeskills.lesson9.mainTask.ThreeDecimalVectorable;
import com.teachmeskills.lesson9.mainTask.Vector;

public final class VectorUtils {
    private final static double SCALE = Math.pow(10, 2);

    private VectorUtils() {
    }

    public static double randomNumber() {
        int minimumNumberRange = -10;
        int maximumNumberRange = 10;
        return roundNumber(minimumNumberRange + (Math.random() * ((maximumNumberRange - minimumNumberRange) + 1)));
    }

    public static void printVectorArray(Vector[] vectorArray) {
        for (Vector vector: vectorArray) {
            System.out.println(vector);
        }
    }

    public static double roundNumber(double number) {
        return Math.ceil(number * SCALE) / SCALE;
    }
}
