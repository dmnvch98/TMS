package com.teachmeskills.lesson7;

import com.teachmeskills.lesson7.shapes.Triangle;

public final class Utils {
    public static void print(Object value) {
        System.out.println(value.toString());
    }

    public static boolean ifTriangleValid(double a, double b, double c) {
        return a + b <= c || a + c <= b || b + c <= a;
    }
}
