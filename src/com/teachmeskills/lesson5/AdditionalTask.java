package com.teachmeskills.lesson5;

import static com.teachmeskills.lesson5.TestData.twoDimensionalArr;

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
}
