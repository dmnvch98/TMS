package com.teachmeskills.lesson6.computer;

public class Computer {
    private final int price;
    private final String model;
    private final RAM ram;
    private final HDD hdd;

    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(int price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer {" +
                "price = " + price +
                ", model = '" + model + '\'' +
                ", ram = " + ram.toString() +
                ", hdd = " + hdd.toString() +
                '}';
    }
}
