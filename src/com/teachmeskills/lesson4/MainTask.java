package com.teachmeskills.lesson4;
import java.util.Arrays;

import static com.teachmeskills.lesson4.Utils.*;

public class MainTask {
    public final static String ASK_ARR_LENGTH = "Укажите размер массива: ";
    public final static String IF_EXIST = "Введите число, наличие которого нужно проверить: ";
    public final static String ASK_TO_DELETE = "Введите число, которое нужно удалить: ";
    public final static String CONSIST = "Массив содержит введенное число: ";
    public final static String NOT_CONSIST = "Массив не содержит введенного числа: ";
    public final static String INITIAL_ARRAY = "Исходный массив: ";
    public final static String RESULT_ARRAY = "Результат: ";
    public final static String MIN = "Минимальное число: ";
    public final static String MAX = "Максимальное число: ";
    public final static String AVERAGE = "Среднее число: ";
    public final static String EQUALS = "Средние арифметические равны";
    public final static String FIRST_ARR = "Среднее арифметическое больше в первом массиве: ";
    public final static String SECOND_ARR = "Среднее арифметическое больше во втором массиве: ";

    public void ifArrayHasEnteredValue(){
        int[] intArray = new int[]{1, 4, 2, 5, 3, 7, 5, 11, 33, 4};
        System.out.println(INITIAL_ARRAY + Arrays.toString(intArray));
        int enteredValue = askUserToEnterData(IF_EXIST);

        for (int arrElement: intArray) {
            if (enteredValue == arrElement){
                System.out.println(CONSIST + enteredValue + '\n');
                return;
            }
        }
        System.out.println(NOT_CONSIST + enteredValue + '\n');
    }

    public void deleteElementIfArrayHasIt(){
        int[] intArray = new int[]{1, 4, 2, 5, 3, 7, 5, 11, 33, 4, 4};
        System.out.println(INITIAL_ARRAY + Arrays.toString(intArray));
        int numbersQTY = 0;
        int enteredValue = askUserToEnterData(ASK_TO_DELETE);

        for (int arrElement : intArray) {
            if (arrElement == enteredValue) {
                numbersQTY++;
            }
        }

        if (numbersQTY != 0){
            int[] resultArr = new int[intArray.length - numbersQTY];
            int counter = 0;
            for (int arrElement : intArray) {
                if (arrElement != enteredValue) {
                    resultArr[counter] = arrElement;
                    counter++;
                }
            }
            System.out.println(RESULT_ARRAY + Arrays.toString(resultArr) + '\n');
        }
        else {
            System.out.println(NOT_CONSIST + enteredValue + '\n');
        }
    }

    public void getMinMaxAverageNums(){
        int arrLength = askUserToEnterData(ASK_ARR_LENGTH);
        int[] intArr = new int[arrLength];

        fillArrayWithRandomNums(intArr, 0, 100);

        Arrays.sort(intArr);
        int minNum = intArr[0];
        int maxNum = intArr[intArr.length - 1];
        int avgNum = intArr[intArr.length / 2];
        System.out.println(MIN + minNum + '\n' +
                MAX + maxNum + '\n' +
                AVERAGE + avgNum + '\n' +
                Arrays.toString(intArr) + '\n');
    }

    public void compareAverageNums(){
        int[] intFirstArr = new int[]{1, 4, 2, 5, 3, 7, 5, 11, 33, 4, 4};
        int[] intSecondArr = new int[]{23, 11, 17, 5};
        System.out.println(Arrays.toString(intFirstArr) + '\n' +
                Arrays.toString(intSecondArr));
        int firstArrAvg = sumArrNums(intFirstArr) / intFirstArr.length;
        int secondArrAvg = sumArrNums(intSecondArr) / intSecondArr.length;

        if (firstArrAvg > secondArrAvg){
            System.out.println(FIRST_ARR + firstArrAvg + '\n');
        } else if (secondArrAvg > firstArrAvg) {
            System.out.println(SECOND_ARR + secondArrAvg + '\n');
        } else {
            System.out.println(EQUALS + '\n');
        }
    }
}