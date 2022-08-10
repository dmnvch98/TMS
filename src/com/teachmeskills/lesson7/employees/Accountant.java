package com.teachmeskills.lesson7.employees;

import java.util.Date;

import static com.teachmeskills.lesson7.Utils.print;

public class Accountant extends Employee implements Printable {

    public Accountant(String name, Date dateOfEmployment) {
        super(name, dateOfEmployment);
    }

    public Accountant() {
    }

    @Override
    public String toString() {
        return "Accountant";
    }

    @Override
    public void printJobTitle() {
        print(toString());
    }
}
