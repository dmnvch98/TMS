package com.teachmeskills.lesson6.creditCard;

public class CreditCard {

    private final long accountNumber;
    private int currentBalance;

    public CreditCard(long accountNumber, int currentBalance) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentBalance;
    }

    public void fillBalance(int amount) {
        if (amount > 0) {
            currentBalance += amount;
        }
    }

    public void withdrawMoney(int amount) {
        if (amount > 0 && amount <= currentBalance) {
            currentBalance -= amount;
        }
    }

    @Override
    public String toString() {
        return "Номер счета = " + accountNumber + ", текущий баланс = " + currentBalance;
    }
}
