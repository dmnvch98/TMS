package com.teachmeskills.lesson14.additionalTask;

import com.teachmeskills.Utils;

import static com.teachmeskills.Utils.*;

public class LambdaTest {
    public void printReverseOrFactorial() {
        int enteredNumber = Utils.askEnterNumber();
        switch (enteredNumber) {
            case 1 -> {
                Printable<String> someInterface = a -> new StringBuilder(a).reverse().toString();
                String stringToReverse = askEnterString();
                print(someInterface.someMethod(stringToReverse));
            }
            case 2 -> {
                Printable<Integer> someInterface = a -> {
                    int result = 1;
                    for (int i = 1; i <= a; i++) {
                        result = result * i;
                    }
                    return result;
                };
                int numberToFactorial = askEnterNumber();
                print(someInterface.someMethod(numberToFactorial));
            }
            default -> print(Utils.INCORRECT_VALUE);
        }
    }
}
