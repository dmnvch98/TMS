package com.teachmeskills.lesson6.creditCard;

public class CreditCardService {
    public void fillBalance(CreditCard creditCard, int amount) {
        if (amount > 0) {
            creditCard.setCurrentBalance(creditCard.getCurrentBalance() + amount);
        }
    }

    public void withdrawMoney(CreditCard creditCard, int amount) {
        if (amount > 0 && amount <= creditCard.getCurrentBalance()) {
            creditCard.setCurrentBalance(creditCard.getCurrentBalance() - amount);
        }
    }
}
