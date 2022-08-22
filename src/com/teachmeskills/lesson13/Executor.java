package com.teachmeskills.lesson13;

import com.teachmeskills.lesson13.additionalTask.CustomArrayList;
import com.teachmeskills.lesson13.mainTask.DocumentNumberValidationReport;

import static com.teachmeskills.Utils.print;

public class Executor {
    public static void main(String[] args) {
        DocumentNumberValidationReport.validateAllDocuments();

        CustomArrayList<Integer> list = new CustomArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        print(list);
        list.remove(44);
        print(list.get(44));
        print(list.size());
        list.clear();
        print(list.size());
    }
}
