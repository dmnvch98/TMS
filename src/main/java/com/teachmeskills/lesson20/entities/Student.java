package com.teachmeskills.lesson20.entities;

import com.teachmeskills.lesson20.Test;
import com.teachmeskills.lesson20.exceptions.IdNotExistException;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private String lastName;
    private Gender gender;
    private int age;
    private int height;
    private int classId;

    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) throws IdNotExistException {
        if (new Test().checkIfIDExistInSpecifiedTable("class", classId)) {
            this.classId = classId;
        } else {
            throw new IdNotExistException("There is no such CLASS id in the database");
        }
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) throws IdNotExistException {
        if (new Test().checkIfIDExistInSpecifiedTable("city", cityId)) {
            this.cityId = cityId;
        } else {
            throw new IdNotExistException("There is no such CITY id in the database");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", height=" + height +
                ", class_id=" + classId +
                '}';
    }
}
