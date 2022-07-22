package com.teachmeskills.lesson6.atm;

import static com.teachmeskills.lesson6.Utils.*;

public class ATM {
    private int twentyDollarsQTY;
    private int fiftyDollarsQTY;
    private int oneHundredDollarsQTY;
    private int[] banknotes;

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

    private int[] initBanknotesArray() {
        int[] banknotes = new int[twentyDollarsQTY + fiftyDollarsQTY + oneHundredDollarsQTY];

        fillArrayInRange(0, oneHundredDollarsQTY, 100, banknotes);
        fillArrayInRange(oneHundredDollarsQTY, oneHundredDollarsQTY + fiftyDollarsQTY, 50, banknotes);
        fillArrayInRange(oneHundredDollarsQTY + fiftyDollarsQTY, banknotes.length, 20, banknotes);

        return banknotes;
    }

    private boolean calculateBanknotes(int amount) {
        banknotes = initBanknotesArray();
        for (int banknote : banknotes) {
            if (amount / banknote >= 1) {
                amount -= banknote;
            }
        }
        return amount == 0;
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
        if (amount <= getBalance() && calculateBanknotes(amount)) {
            print(REMOVED_BANKNOTES);
            for (int banknote : banknotes) {
                if (amount / banknote >= 1) {
                    print(banknote);
                    amount -= banknote;
                    updateBanknotesQTY(banknote);
                }
            }
            return true;
        } else {
            return false;
        }
    }
}

