package com.teachmeskills.lesson20;

public class Executor {
    public static void main(String[] args) {
        DatabaseController databaseController = new DatabaseController();
        databaseController.getStudentAndTheirCityInfo().entrySet().forEach(System.out::println);
    }
}
