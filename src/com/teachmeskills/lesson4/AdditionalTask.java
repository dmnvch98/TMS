package com.teachmeskills.lesson4;

import java.util.Arrays;

import static com.teachmeskills.lesson4.Utils.*;

public class AdditionalTask {
    public final static String NO_EVEN_NUMS = "В исходном массиве нет четных чисел.";

    public void createTwoArraysInRangeAndEven() {
        int firstArrLength = askUserToEnterDataInRange(5, 10);
        int[] intFirstArr = new int[firstArrLength];
        fillArrayWithRandomNums(intFirstArr, 0, 100);
        System.out.println(Arrays.toString(intFirstArr));

        int evenNumsQTY = 0;

        for (int arrElement : intFirstArr) {
            if (arrElement % 2 == 0) {
                evenNumsQTY++;
            }
        }

        if (evenNumsQTY != 0) {
            int[] evenArr = new int[evenNumsQTY];
            int counter = 0;
            for (int arrElement : intFirstArr) {
                if (arrElement % 2 == 0) {
                    evenArr[counter] = arrElement;
                    counter++;
                }
            }
            System.out.println(Arrays.toString(evenArr) + '\n');
        } else System.out.println(NO_EVEN_NUMS + '\n');
    }

    public void changeOddIndexesToZeros() {
        int[] intArray = new int[]{1, 4, 2, 5, 3, 7, 5, 11, 33, 4, 4};
        System.out.println(MainTask.INITIAL_ARRAY + Arrays.toString(intArray));

        for (int i = 0; i < intArray.length; i++) {
            if (!(i % 2 == 0)) {
                intArray[i] = 0;
            }
        }
        System.out.println(MainTask.RESULT_ARRAY + Arrays.toString(intArray) + '\n');
    }

    public void sortNamesArray() {
        String[] namesArray = new String[]{"Eugen", "Vlad", "Masha", "Katya", "Vova", "Lena", "Glasha", "Masha"};
        Arrays.sort(namesArray);
        System.out.println(MainTask.RESULT_ARRAY + Arrays.toString(namesArray) + '\n');
    }

    public void bubbleSort(int[] intArr) {
        System.out.println(MainTask.INITIAL_ARRAY + Arrays.toString(intArr));
        for (int i = 0; i < intArr.length; i++) {
            for (int k = 0; k < intArr.length - 1; k++) {
                if (intArr[k] > intArr[k + 1]) {
                    int tempInteger = intArr[k];
                    intArr[k] = intArr[k + 1];
                    intArr[k + 1] = tempInteger;
                }
            }
        }
        System.out.println(MainTask.RESULT_ARRAY + Arrays.toString(intArr));
    }
}
