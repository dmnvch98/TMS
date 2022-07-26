package com.teachmeskills.lesson6.atm;

public class ATM {
    private int twentyDollarsQTY;
    private int fiftyDollarsQTY;
    private int oneHundredDollarsQTY;

    public ATM(int twentyDollarsQTY, int fiftyDollarsQTY, int oneHundredDollarsQTY) {
        this.twentyDollarsQTY = twentyDollarsQTY;
        this.fiftyDollarsQTY = fiftyDollarsQTY;
        this.oneHundredDollarsQTY = oneHundredDollarsQTY;
    }

    public int getTwentyDollarsQTY() {
        return twentyDollarsQTY;
    }

    public void setTwentyDollarsQTY(int twentyDollarsQTY) {
        this.twentyDollarsQTY = twentyDollarsQTY;
    }

    public int getFiftyDollarsQTY() {
        return fiftyDollarsQTY;
    }

    public void setFiftyDollarsQTY(int fiftyDollarsQTY) {
        this.fiftyDollarsQTY = fiftyDollarsQTY;
    }

    public int getOneHundredDollarsQTY() {
        return oneHundredDollarsQTY;
    }

    public void setOneHundredDollarsQTY(int oneHundredDollarsQTY) {
        this.oneHundredDollarsQTY = oneHundredDollarsQTY;
    }
}

