package com.teachmeskills.lesson8.clinic;

import static com.teachmeskills.lesson8.phone.Utils.print;

public class Therapist extends Doctor {
    public final static String THERAPIST_TREAT = "Я лечу простуду";
    public final static String THERAPIST_TITLE = "Терапевт";

    public Therapist(String name) {
        super(name);
    }

    @Override
    public void treat() {
        print(THERAPIST_TREAT);
    }

    @Override
    public String toString() {
        return THERAPIST_TITLE;
    }
}
