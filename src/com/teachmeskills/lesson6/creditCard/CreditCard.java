package com.teachmeskills.lesson6.creditCard;

public class CreditCard {
    private final long accountNumber;
    private int currentBalance;

    public CreditCard(long accountNumber, int currentBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    @Override
    public String toString() {
        return "Номер счета = " + accountNumber + ", текущий баланс = " + currentBalance;
    }
}
