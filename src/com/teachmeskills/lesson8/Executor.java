package com.teachmeskills.lesson8;

import com.teachmeskills.lesson8.clinic.Clinic;
import com.teachmeskills.lesson8.clinic.Patient;
import com.teachmeskills.lesson8.clinic.TreatmentPlan;
import com.teachmeskills.lesson8.phone.Phone;

import static com.teachmeskills.lesson8.phone.Utils.print;

public class
Executor {
    public static void main(String[] args) {
        Phone phone1 = new Phone(375256045519L, 120, "iPhone 12");
        Phone phone2 = new Phone(375296983574L, 110, "Xiaomi Redmi 5");
        Phone phone3 = new Phone(375333157896L, 135, "Samsung Galaxy Note 10");

        print(phone1);
        print(phone2);
        print(phone3);
        print(phone1.getNumber());
        print(phone2.getNumber());
        print(phone3.getNumber());

        phone1.receiveCall("Женя");
        phone2.receiveCall("Влад");
        phone3.receiveCall("Вова");

        phone1.receiveCall("Женя", 375256045519L);
        phone2.receiveCall("Влад", 375296983574L);
        phone3.receiveCall("Вова", 375333157896L);

        phone1.sendMessage(375256045519L, 375296983574L, 375333157896L);

        Clinic clinic = new Clinic();
        Patient patient = new Patient();
        TreatmentPlan treatmentPlan = new TreatmentPlan(2);

        clinic.assignTreatmentPlan(patient, treatmentPlan);
        clinic.assignDoctor(patient, treatmentPlan);

        treatmentPlan.setPlanCode(4);
        clinic.assignDoctor(patient, treatmentPlan);
    }
}
