package com.teachmeskills.lesson7.employees;

import java.util.Date;

import static com.teachmeskills.lesson7.Utils.print;

public class Worker extends Employee implements Printable {

    public Worker(String name, Date dateOfEmployment) {
        super(name, dateOfEmployment);
    }

    public Worker() {
    }

    @Override
    public String toString() {
        return "Worker";
    }

    @Override
    public void printJobTitle() {
        print(toString());
    }


}
