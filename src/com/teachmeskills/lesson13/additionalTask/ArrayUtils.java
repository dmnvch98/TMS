package com.teachmeskills.lesson13.additionalTask;

import java.util.Arrays;

public final class ArrayUtils {
    private ArrayUtils() {
    }

    public static <T> T[] concatWithArrayCopy(T[] array1, T[] array2) {
        T[] result = Arrays.copyOf(array1, array1.length + array2.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }
}
