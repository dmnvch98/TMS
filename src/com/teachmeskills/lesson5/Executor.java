package com.teachmeskills.lesson5;

import static com.teachmeskills.lesson5.Utils.*;

public class Executor {
    public static void main(String[] args) {
        MainTask mainTask = new MainTask();
        printComplexArr(mainTask.increaseEachElementByEnteredNum());
        printMatrix(mainTask.fillChessBoard());
    }
}
