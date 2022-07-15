package com.teachmeskills.lesson4;

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

    public static int askUserToEnterDataInRange(int rangeStart, int rangeEnd) {
        while (true) {
            int enteredValue = askUserToEnterData("Введите число в диапазоне от " + rangeStart + " до " + rangeEnd + ": ");
            if (enteredValue > rangeStart && enteredValue <= rangeEnd) {
                return enteredValue;
            }
            System.out.println(INCORRECT);
        }
    }

    public static int sumArrNums(int[] arr) {
        int result = 0;
        for (int arrElement : arr) {
            result += arrElement;
        }
        return result;
    }

    public static void fillArrayWithRandomNums(int[] intArr, int startRange, int endRange) {
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = startRange + (int) (Math.random() * endRange);
        }
    }
}
