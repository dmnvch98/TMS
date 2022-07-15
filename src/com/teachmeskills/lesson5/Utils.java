package com.teachmeskills.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public final class Utils {
    public final static String INCORRECT = "Вы ввели неверное значение";

    public static int askUserToEnterData(String messageToPrint) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(messageToPrint);
            String enteredValue = scanner.next();
            try {
                int enteredNum = Integer.parseInt(enteredValue);
                if (enteredNum > 0) {
                    return enteredNum;
                }
            } catch (NumberFormatException e) {
                System.out.println(INCORRECT);
            }
        }
    }

    public static void print(Object value) {
        System.out.println(value.toString());
    }

    public static void printComplexArr(Object[] arr) {
        System.out.println(Arrays.deepToString(arr));
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printMatrix(Object[][] matrix) {
        for (Object[] objects : matrix) {
            for (Object object : objects) {
                System.out.print(object + " ");
            }
            System.out.println();
        }
    }

    public static int[] bubbleSort(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            for (int k = 0; k < intArr.length - 1; k++) {
                if (intArr[k] > intArr[k + 1]) {
                    int tempInteger = intArr[k];
                    intArr[k] = intArr[k + 1];
                    intArr[k + 1] = tempInteger;
                }
            }
        }
        return intArr;
    }
}
