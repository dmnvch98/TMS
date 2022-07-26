package com.teachmeskills.lesson6.atm;

import java.util.Arrays;

import static com.teachmeskills.lesson6.Utils.*;

public class ATMService {
    public void fillATM(ATM atm, int twentyDollarsQTY, int fiftyDollarsQTY, int oneHundredDollarsQTY) {
        if (twentyDollarsQTY >= 0 && fiftyDollarsQTY >= 0 && oneHundredDollarsQTY >= 0) {
            atm.setTwentyDollarsQTY(atm.getTwentyDollarsQTY() + twentyDollarsQTY);
            atm.setFiftyDollarsQTY(atm.getFiftyDollarsQTY() + fiftyDollarsQTY);
            atm.setOneHundredDollarsQTY(atm.getOneHundredDollarsQTY() + oneHundredDollarsQTY);
        }
    }

    public int getBalance(ATM atm) {
        return (20 * atm.getTwentyDollarsQTY()) + (50 * atm.getFiftyDollarsQTY()) + (100 * atm.getOneHundredDollarsQTY());
    }

    private int[] initAvailableBanknotesArray(ATM atm) {
        int[] banknotes = new int[atm.getTwentyDollarsQTY() + atm.getFiftyDollarsQTY() + atm.getOneHundredDollarsQTY()];

        fillArrayInRange(0, atm.getOneHundredDollarsQTY(), 100, banknotes);
        fillArrayInRange(atm.getOneHundredDollarsQTY(), atm.getOneHundredDollarsQTY() + atm.getFiftyDollarsQTY(), 50, banknotes);
        fillArrayInRange(atm.getOneHundredDollarsQTY() + atm.getFiftyDollarsQTY(), banknotes.length, 20, banknotes);

        return banknotes;
    }

    private int[] calculateBanknotesToWithdraw(ATM atm, int amount) {
        int[] availableBanknotes = initAvailableBanknotesArray(atm);
        int[] banknotesToWithdraw = new int[0];
        int counter = 0;
        for (int banknote : availableBanknotes) {
            if (amount / banknote >= 1) {
                amount -= banknote;
                banknotesToWithdraw = Arrays.copyOf(banknotesToWithdraw, banknotesToWithdraw.length + 1);
                banknotesToWithdraw[counter] = banknote;
                counter++;
            }
        }
        return amount == 0 ? banknotesToWithdraw : new int[0];
    }

    private void updateBanknotesQTY(ATM atm, int banknote) {
        switch (banknote) {
            case 100 -> atm.setOneHundredDollarsQTY(atm.getOneHundredDollarsQTY() - 1);
            case 50 -> atm.setFiftyDollarsQTY(atm.getFiftyDollarsQTY() - 1);
            case 20 -> atm.setTwentyDollarsQTY(atm.getTwentyDollarsQTY() - 1);
        }
    }

    public boolean withdrawMoney(ATM atm, int amount) {
        int[] banknotesToWithdraw = calculateBanknotesToWithdraw(atm, amount);
        if (amount <= getBalance(atm) && banknotesToWithdraw.length != 0) {
            print(REMOVED_BANKNOTES);
            for (int banknote : banknotesToWithdraw) {
                print(banknote);
                updateBanknotesQTY(atm, banknote);
            }
            return true;
        } else {
            return false;
        }
    }
}
