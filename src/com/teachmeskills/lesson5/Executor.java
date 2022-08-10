package com.teachmeskills.lesson5;

import static com.teachmeskills.lesson5.Utils.*;

public class Executor {
    public static void main(String[] args) {
        MainTask mainTask = new MainTask();
        printComplexArr(mainTask.increaseEachElementByEnteredNum());
        printMatrix(mainTask.fillChessBoard());

        AdditionalTask additionalTask = new AdditionalTask();
        print(additionalTask.sumMatrixElements());
        printArray(additionalTask.displayArrDiagonal());
        printMatrix((additionalTask.sortMatrix()));
        printMatrix(additionalTask.multipleMatrix());
    }
}
