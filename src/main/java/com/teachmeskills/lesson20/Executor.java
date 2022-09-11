package com.teachmeskills.lesson20;

import com.teachmeskills.lesson20.entities.City;
import com.teachmeskills.lesson20.entities.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.teachmeskills.lesson20.entities.Gender.*;

public class Executor {
    public static void main(String[] args) {
        Test test = new Test();
        test.getStudentAndTheirCityInfo().entrySet().forEach(System.out::println);
    }

    public static void camelCaseToUpperCase(String string) {
        string = Arrays.stream(string.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])"))
                .map(String::toUpperCase)
                .collect(Collectors.joining("_"));
        System.out.println(string);
    }

    public Student createStudent() {
        Student student = new Student();
        student.setName("Sasha");
        student.setLastName("Kudryavkiy");
        student.setCityId(5);
        student.setAge(23);
        student.setGender(male);
        student.setHeight(183);
        student.setClassId(2);
        return student;
    }

    public City createCity() {
        City city = new City();
        city.setCountryId(2);
        city.setDescription("Capital of France");
        city.setName("Paris");
        return city;
    }
}
