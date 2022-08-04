package com.teachmeskills.lesson9;
import com.teachmeskills.lesson9.mainTask.Vectorable;

public final class VectorUtils {
    private final static double SCALE = Math.pow(10, 2);

    private VectorUtils() {
    }

    public static double randomNumber() {
        int minimumNumberRange = -10;
        int maximumNumberRange = 10;
        return roundNumber(minimumNumberRange + (Math.random() * ((maximumNumberRange - minimumNumberRange) + 1)));
    }

    public static double randomNumber(int minimumNumberRange, int maximumNumberRange) {
        return roundNumber(minimumNumberRange + (Math.random() * ((maximumNumberRange - minimumNumberRange) + 1)));
    }

    public static void printVectorArray(Vectorable[] vectorArray) {
        for (Vectorable vector: vectorArray) {
            System.out.println(vector);
        }
    }

    public static void fillArrayWithRandomNumber(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber();
        }
    }

    public static double roundNumber(double number) {
        return Math.ceil(number * SCALE) / SCALE;
    }
    public static void print(Object object) {
        System.out.println(object);
    }
}
