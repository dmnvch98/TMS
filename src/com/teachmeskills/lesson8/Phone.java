package com.teachmeskills.lesson8;

import static com.teachmeskills.lesson8.Utils.print;

public class Phone {
    private long number;
    private int weight;
    private String model;
    public final static String RECEIVE_CALL_STRING = "Звонит ";


    public Phone(long number, int weight, String model) {
        this.weight = weight;
        new Phone(number, model);
    }

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void receiveCall(String name) {
        print(RECEIVE_CALL_STRING + name);
    }

    public void receiveCall(String name, long number) {
        print(RECEIVE_CALL_STRING + name + " " + number);
    }

    public void sendMessage(long... numbers) {
        for (long number : numbers) {
            print(number);
        }
    }

    @Override
    public String toString() {
        return "number=" + number +
                ", weight=" + weight +
                ", model='" + model;
    }
}
