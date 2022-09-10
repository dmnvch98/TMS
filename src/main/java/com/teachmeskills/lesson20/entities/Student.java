package com.teachmeskills.lesson20.entities;
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

    public int getCityId() {
        return cityId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
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
                ", classId=" + classId +
                ", cityId=" + cityId +
                '}';
    }
}
