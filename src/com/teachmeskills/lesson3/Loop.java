package com.teachmeskills.lesson3;

public class Loop {
    public void printOddNums(){
        int endNum = 99;
        for (int i = 1; i <= endNum; i++){
            if (!(i % 2 == 0)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void countDown(){
        for (int i = 5; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void sumEnteredNums(){
        int enteredValue = Utils.askUserToEnterData("Enter positive number: ");
        int result = 0;
        for (int i = 1; i < enteredValue + 1; i++){
            result += i;
        }
        System.out.println(result);
    }

    public void printSequenceSeven(){
        int counter = 7;
        while (counter <= 98){
            System.out.print(counter + " ");
            counter += 7;
        }
        System.out.println();
    }

    public void printSequenceMinusFive(){
        int counter = 0;
        for (int i = 0; i < 10; i++){
            System.out.print(counter + " ");
            counter -= 5;
        }
        System.out.println();
    }

    public void squareFromTenToTwenty(){
        for (int i = 10; i <= 20; i++){
            System.out.print(i * i + " ");
        }
    }
}
