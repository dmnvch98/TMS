package com.teachmeskills.lesson4;

public class Executor {
    public static void main(String[] args) {
        MainTask mainTask = new MainTask();
        mainTask.ifArrayHasEnteredValue();
        mainTask.deleteElementIfArrayHasIt();
        mainTask.getMinMaxAverageNums();
        mainTask.compareAverageNums();

        AdditionalTask additionalTask = new AdditionalTask();
        additionalTask.createTwoArraysInRangeAndEven();
        additionalTask.changeOddIndexesToZeros();
        additionalTask.sortNamesArray();
        additionalTask.bubbleSort(new int[]{3, 1, 5, 2, 9, 13, 22, 77, 3, 4});
    }
}
