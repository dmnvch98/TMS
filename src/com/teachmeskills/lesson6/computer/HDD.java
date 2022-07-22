package com.teachmeskills.lesson6.computer;

public class HDD {
    private String name;
    private int value;
    private TypeHDD type;

    public HDD(String name, int value, TypeHDD type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public HDD() {
    }

    @Override
    public String toString() {
        return "{" +
                "name = '" + name + '\'' +
                ", value = " + value +
                ", type = " + type +
                '}';
    }
}
