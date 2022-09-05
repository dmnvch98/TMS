package com.teachmeskills;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Utils {
    public static String INCORRECT_VALUE = "Incorrect value entered";
    public static String ASK_NUMBER = "Enter number: ";
    public static String ASK_STRING = "Enter string";

    private static Scanner scanner;
    private Utils() {
    }
    public static void print(Object object) {
        System.out.println(object);
    }

    public static int askEnterNumber() {
        while (true){
            print(ASK_NUMBER);
            try {
                scanner = new Scanner(System.in);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                print(INCORRECT_VALUE);
            }
        }
    }

    public static String askEnterString() {
        scanner = new Scanner(System.in);
        print(ASK_STRING);
        return scanner.nextLine();
    }

    public static int askEnterNumber(String text) {
        print(text);
        while (true){
            System.out.print(ASK_NUMBER);
            try {
                scanner = new Scanner(System.in);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                print(INCORRECT_VALUE);
            }
        }
    }
}
