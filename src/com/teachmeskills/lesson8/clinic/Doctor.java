package com.teachmeskills.lesson8.clinic;

public abstract class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void treat();
}
