package com.teachmeskills.lesson8.clinic;

import static com.teachmeskills.lesson8.phone.Utils.print;

public class Surgeon extends Doctor {
    public final static String SURGEON_TREAT = "Я вправляю кости";
    public final static String SURGEON_TITLE = "Хирург";

    public Surgeon(String name) {
        super(name);
    }

    @Override
    public void treat() {
        print(SURGEON_TREAT);
    }

    @Override
    public String toString() {
        return SURGEON_TITLE;
    }
}
