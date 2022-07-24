package com.teachmeskills.lesson6.atm;

import java.util.Arrays;

import static com.teachmeskills.lesson6.Utils.*;

public class ATM {
    private int twentyDollarsQTY;
    private int fiftyDollarsQTY;
    private int oneHundredDollarsQTY;

    public ATM(int twentyDollarsQTY, int fiftyDollarsQTY, int oneHundredDollarsQTY) {
        this.twentyDollarsQTY = twentyDollarsQTY;
        this.fiftyDollarsQTY = fiftyDollarsQTY;
        this.oneHundredDollarsQTY = oneHundredDollarsQTY;
    }

    public void fillATM(int twentyDollarsQTY, int fiftyDollarsQTY, int oneHundredDollarsQTY) {
        if (twentyDollarsQTY >= 0 && fiftyDollarsQTY >= 0 && oneHundredDollarsQTY >= 0) {
            this.twentyDollarsQTY += twentyDollarsQTY;
            this.fiftyDollarsQTY += fiftyDollarsQTY;
            this.oneHundredDollarsQTY += oneHundredDollarsQTY;
        }
    }

    public int getBalance() {
        return (20 * twentyDollarsQTY) + (50 * fiftyDollarsQTY) + (100 * oneHundredDollarsQTY);
    }

    private int[] initAvailableBanknotesArray() {
        int[] availableBanknotes = new int[twentyDollarsQTY + fiftyDollarsQTY + oneHundredDollarsQTY];

        fillArrayInRange(0, oneHundredDollarsQTY, 100, availableBanknotes);
        fillArrayInRange(oneHundredDollarsQTY, oneHundredDollarsQTY + fiftyDollarsQTY, 50, availableBanknotes);
        fillArrayInRange(oneHundredDollarsQTY + fiftyDollarsQTY, availableBanknotes.length, 20, availableBanknotes);

        return availableBanknotes;
    }

    private int[] calculateBanknotesToWithdraw(int amount) {
        int[] availableBanknotes = initAvailableBanknotesArray();
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

    private void updateBanknotesQTY(int banknote) {
        switch (banknote) {
            case 100: {
                oneHundredDollarsQTY--;
                break;
            }
            case 50: {
                fiftyDollarsQTY--;
                break;
            }
            case 20: {
                twentyDollarsQTY--;
                break;
            }
        }
    }

    public boolean withdrawMoney(int amount) {
        int[] banknotesToWithdraw = calculateBanknotesToWithdraw(amount);
        if (amount <= getBalance() && banknotesToWithdraw.length != 0) {
            print(REMOVED_BANKNOTES);
            for (int banknote : banknotesToWithdraw) {
                print(banknote);
                updateBanknotesQTY(banknote);
            }
            return true;
        } else {
            return false;
        }
    }
}

