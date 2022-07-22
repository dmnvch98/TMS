package com.teachmeskills.lesson6;

public final class Utils {
    public final static String BALANCE = "Баланса банкомата: ";
    public final static String WITHDRAW_STATUS = "Снятие наличных: ";
    public final static String REMOVED_BANKNOTES = "Снятые банкноты: ";
    public static void print(Object value) {
        System.out.println(value.toString());
    }

    public static void fillArrayInRange(int start, int end, int value, int[] array) {
        for (int i = start; i < end; i++) {
            array[i] = value;
        }
    }
}
