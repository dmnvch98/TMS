package com.teachmeskills.lesson9.additionalTask;

import com.teachmeskills.lesson9.mainTask.Vectorable;

import java.util.Arrays;

import static com.teachmeskills.lesson9.VectorUtils.*;

public class MultiDecimalVector implements Vectorable {
    private double[] coordinates;

    public MultiDecimalVector(double... coordinates) {
        this.coordinates = coordinates;
    }

    public MultiDecimalVector() {
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public MultiDecimalVector sum(MultiDecimalVector vector) {
        if (this.getCoordinates().length == vector.getCoordinates().length) {
            double[] result = new double[this.coordinates.length];

            for (int i = 0; i < coordinates.length; i++) {
                result[i] = this.coordinates[i] + vector.getCoordinates()[i];
            }
            return new MultiDecimalVector(result);
        }
        return new MultiDecimalVector();
    }

    public MultiDecimalVector minus(MultiDecimalVector vector) {
        if (this.getCoordinates().length == vector.getCoordinates().length) {
            double[] result = new double[this.coordinates.length];

            for (int i = 0; i < coordinates.length; i++) {
                result[i] = this.coordinates[i] - vector.getCoordinates()[i];
            }
            return new MultiDecimalVector(result);
        }
        return new MultiDecimalVector();
    }

    public double length() {
        double length = 0;
        for (double coordinate : this.coordinates) {
            length += coordinate * coordinate;
        }
        return roundNumber(Math.sqrt(length));
    }

    public double scalarProduct(MultiDecimalVector vector) {
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

    public static MultiDecimalVector[] initVectorArray(int number) {
        MultiDecimalVector[] vectorArray = new MultiDecimalVector[number];
        for (int i = 0; i < number; i++) {
            double[] randomArray = new double[(int) randomNumber(3, 10)];
            fillArrayWithRandomNumber(randomArray);
            MultiDecimalVector vectorWithRandomValues = new MultiDecimalVector(randomArray);
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
