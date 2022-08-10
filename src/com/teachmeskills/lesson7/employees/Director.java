package com.teachmeskills.lesson7.employees;

import java.util.Date;

import static com.teachmeskills.lesson7.Utils.print;

public class Director extends Employee implements Printable {

    public Director(String name, Date dateOfEmployment) {
        super(name, dateOfEmployment);
    }

    public Director() {
    }

    @Override
    public String toString() {
        return "Director";
    }

    @Override
    public void printJobTitle() {
        print(toString());
    }
}
