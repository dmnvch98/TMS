package com.teachmeskills.lesson5;

import static com.teachmeskills.lesson5.TestData.*;
import static com.teachmeskills.lesson5.Utils.bubbleSort;

public class AdditionalTask {
    public int sumMatrixElements() {
        int result = 0;
        for (Integer[] oneDimensionalArr : twoDimensionalArr) {
            for (int element : oneDimensionalArr) {
                result += element;
            }
        }
        return result;
    }

    public int[] displayArrDiagonal() {
        int[] diagonalNums = new int[triDimensionalArr.length];

        for (int i = 0; i < twoDimensionalArr.length; i++) {
            for (int j = 0; j < twoDimensionalArr.length; j++) {
                if (i == j) {
                    diagonalNums[i] = twoDimensionalArr[i][j];
                }
            }
        }
        return diagonalNums;
    }

    public Integer[][] sortMatrix() {
        for (Integer[] oneDimensionalArr : twoDimensionalArr) {
            bubbleSort(oneDimensionalArr);
        }
        return twoDimensionalArr;
    }

    public Integer[][] multipleMatrix() {
        Integer[][] resultArr = new Integer[3][3];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix.length - 1; j++) {
                resultArr[i][j] = 0;
                for (int k = 0; k < resultArr.length; k++) {
                    resultArr[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return resultArr;
    }
}
