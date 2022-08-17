package com.teachmeskills.lesson13.mainTask;

import com.teachmeskills.lesson13.additionalTask.CustomArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Executor {
    public static void main(String[] args) throws IOException {
        CustomArrayList<String> list = new CustomArrayList<>(5);
        CustomArrayList<String> list1 = new CustomArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(String.valueOf(i));
        }
        String someString = "3242";
        String someString2 = "3242";
        System.out.println(list);
        list.clear();
        list.add("23423");
        list.add("sdfa");
        list.add("234rthr23");
        list.add(someString);
        list.add("asd");
    }
}
