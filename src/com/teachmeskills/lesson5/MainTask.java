package com.teachmeskills.lesson5;

import static com.teachmeskills.lesson5.Utils.*;

public class MainTask {
    public final static String ASK_TO_INCREASE = "На сколько вы хотите увеличить каждый элемент массива: ";

    public int[][][] increaseEachElementByEnteredNum() {
        int enteredValue = askUserToEnterData(ASK_TO_INCREASE);
        int[][][] triDimensionalArr = new int[][][]{
                {
                        {3, 2, 5},
                        {5, 7, 1}
                },
                {
                        {3, 2, 5},
                        {5, 7, 1},
                        {9, 2, 6}
                },
                {
                        {8, 1, 4},
                }
        };

        for (int[][] twoDimensionalArr : triDimensionalArr) {
            for (int[] oneDimensionalArr : twoDimensionalArr) {
                for (int i = 0; i < oneDimensionalArr.length; i++) {
                    oneDimensionalArr[i] += enteredValue;
                }
            }
        }
        return triDimensionalArr;
    }

    public String[][] fillChessBoard() {
        String[][] twoDimensionalArr = new String[8][8];
        for (int i = 0; i < twoDimensionalArr.length; i++) {
            for (int j = 0; j < twoDimensionalArr.length; j++) {
                if ((i % 2 == 0) == (j % 2 == 0)) {
                    twoDimensionalArr[i][j] = "W";
                } else {
                    twoDimensionalArr[i][j] = "B";
                }
            }
        }
        return twoDimensionalArr;
    }
}
