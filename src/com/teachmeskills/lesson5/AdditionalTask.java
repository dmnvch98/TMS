package com.teachmeskills.lesson5;

import static com.teachmeskills.lesson5.TestData.triDimensionalArr;
import static com.teachmeskills.lesson5.TestData.twoDimensionalArr;
import static com.teachmeskills.lesson5.Utils.bubbleSort;

public class AdditionalTask {
    public int sumMatrixElements() {
        int result = 0;
        for (int[] oneDimensionalArr : twoDimensionalArr) {
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

    public int[][] sortMatrix() {
        for (int[] oneDimensionalArr : twoDimensionalArr) {
            bubbleSort(oneDimensionalArr);
        }
        return twoDimensionalArr;
    }
}
