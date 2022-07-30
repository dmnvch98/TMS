package com.teachmeskills.lesson8.clinic;

import static com.teachmeskills.lesson8.phone.Utils.print;

public class Dentist extends Doctor {
    public final static String DENTIST_TREAT = "Я лечу зубы";
    public final static String DENTIST_TITLE = "Стоматлог";

    public Dentist(String name) {
        super(name);
    }

    @Override
    public void treat() {
        print(DENTIST_TREAT);
    }

    @Override
    public String toString() {
        return DENTIST_TITLE;
    }
}
