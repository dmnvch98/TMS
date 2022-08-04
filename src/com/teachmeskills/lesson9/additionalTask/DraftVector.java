package com.teachmeskills.lesson9.additionalTask;

import java.util.Arrays;

import static com.teachmeskills.lesson9.VectorUtils.*;

public class DraftVector {
    private final double[] coordinates;

    public DraftVector(double... coordinates) {
        this.coordinates = coordinates;
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public void sum(DraftVector vector) {
        if (this.getCoordinates().length == vector.getCoordinates().length) {
            double[] result = new double[this.coordinates.length];

            for (int i = 0; i < coordinates.length; i++) {
                result[i] = this.coordinates[i] + vector.getCoordinates()[i];
            }
            System.out.println(Arrays.toString(result));
        }
    }

    public void minus(DraftVector vector) {
        if (this.getCoordinates().length == vector.getCoordinates().length) {
            double[] result = new double[this.coordinates.length];

            for (int i = 0; i < coordinates.length; i++) {
                result[i] = this.coordinates[i] - vector.getCoordinates()[i];
            }
            System.out.println(Arrays.toString(result));
        }
    }

    public double length() {
        double length = 0;
        for (double coordinate : this.coordinates) {
            length += coordinate * coordinate;
        }
        return roundNumber(Math.sqrt(length));
    }

    public double scalarProduct(DraftVector vector) {
        double scalarProduct = 0;
        if (this.getCoordinates().length == vector.getCoordinates().length) {
            for (int i = 0; i < this.getCoordinates().length; i++) {
                scalarProduct += this.getCoordinates()[i] * vector.getCoordinates()[i];
            }
            return scalarProduct;
        } else {
            return 0;
        }
    }

    public static DraftVector[] initVectorArray(int number) {
        DraftVector[] vectorArray = new DraftVector[number];
        for (int i = 0; i < number; i++) {
            double[] randomArray = new double[(int) randomNumber(3, 10)];
            fillArrayWithRandomNumber(randomArray);
            DraftVector vectorWithRandomValues = new DraftVector(randomArray);
            vectorArray[i] = vectorWithRandomValues;
        }
        return vectorArray;
    }

    @Override
    public String toString() {
        return getCoordinates().length + "-мерный вектор " +
                "Координаты=" + Arrays.toString(coordinates);
    }
}
