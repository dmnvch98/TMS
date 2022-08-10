package com.teachmeskills.lesson2;

public class Test {
    public void sum(double operand1, double operand2){
        System.out.println("Сумма = " + (operand1 + operand2));
    }

    public void logicalCompareAND(boolean testBooleanValue1, boolean testBooleanValue2){
        System.out.println(testBooleanValue1 && testBooleanValue2);
    }

    public void getStringLength(String testStringValue){
        System.out.println(testStringValue.length());
    }

    public void charsToString(char[] testCharArr){
        System.out.println(String.valueOf(testCharArr));
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.sum(1.54, 42);
        test.logicalCompareAND(true, false);
        test.charsToString(new char[]{'h', 'e', 'l', 'l', 'o'});
        test.getStringLength("Some string to test my method");
    }
}