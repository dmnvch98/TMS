package com.teachmeskills.lesson6.computer;

public class RAM {
    private String name;
    private int value;

    public RAM(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public RAM() {
    }

    @Override
    public String toString() {
        return "{" +
                "name = '" + name + '\'' +
                ", value = " + value +
                '}';
    }
}
