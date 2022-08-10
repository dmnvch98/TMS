package com.teachmeskills.lesson3;

public class AdditionalTask {
    public final static String ASK_MONEY_SUM = "Введите сумму, которую вы хотите положить на счет: ";
    public final static String ASK_MONTH_QTY = "На сколько месяцев вы хотите открыть счет?: ";
    public void getFirstElevenFibonacciNumbers(){
        int previousFirst = 0;
        int previousSecond = 1;
        for (int i = 0; i < 11; i++){
           System.out.print(previousFirst + " ");
           int tempNum = previousSecond;
           previousSecond += previousFirst;
           previousFirst = tempNum;
        }
        System.out.println();
    }

    public void calculateDepositIncomeEveryMonth(){
        final float percentage = (float) 0.07;
        float moneyAmount = Utils.askUserToEnterData(ASK_MONEY_SUM);
        int monthQTY = Utils.askUserToEnterData(ASK_MONTH_QTY);
        for (int i = 1; i < monthQTY + 1; i++){
            moneyAmount +=  moneyAmount * percentage;
            System.out.println(i +" : " + (moneyAmount));
        }
    }

    public void printMultiplicationTable(){
        for (int i = 1; i < 11; i++){
            for (int k = 1; k< 10; k++){
                System.out.println(i + " x " + k + " = " + (i*k));
            }
            System.out.println();
        }
    }
}
