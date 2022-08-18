package com.teachmeskills.lesson13;

import com.teachmeskills.lesson13.additionalTask.CustomArrayList;

import java.io.IOException;

import static com.teachmeskills.Utils.print;

public class Executor {
    public static void main(String[] args) throws IOException {
        CustomArrayList<Integer> list = new CustomArrayList<>(50);
        CustomArrayList<Integer> list1 = new CustomArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
            list1.add(i);
        }
        print(list.get(44));
        print(list1.get(56));

        print(list.remove(44));
        print(list1.remove(56));

        print(list.get(44));
        print(list1.get(56));

        print(list1.size());

        print(list.isPresent(44));
        print(list1.isPresent(57));

        list1.update(1, 11);
        print(list1.get(1));

        list1.clear();
        list.clear();

        print(list1.size());
        print(list.size());
    }
}
