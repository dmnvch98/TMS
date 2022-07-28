package com.teachmeskills.lesson7.employees;

import java.util.Date;

public abstract class Employee {
    private String name;
    private Date dateOfEmployment;

    public Employee(String name, Date dateOfEmployment) {
        this.name = name;
        this.dateOfEmployment = dateOfEmployment;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(Date dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    @Override
    abstract public String toString();
}
