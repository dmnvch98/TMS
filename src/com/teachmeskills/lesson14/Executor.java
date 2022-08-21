package com.teachmeskills.lesson14;

import com.teachmeskills.lesson14.additionalTask.LambdaTest;
import com.teachmeskills.lesson14.mainTask.DateService;

import static com.teachmeskills.Utils.print;

public class Executor {
    public static void main(String[] args) {
        DateService dateService = new DateService();
        print(dateService.getDayOfWeek(1661090841));
        print(dateService.getNextTuesdayDate());

        LambdaTest lambdaTest = new LambdaTest();
        lambdaTest.printReverseOrFactorial();
    }
}
