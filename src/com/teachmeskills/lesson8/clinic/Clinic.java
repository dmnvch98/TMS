package com.teachmeskills.lesson8.clinic;

public class Clinic {
    public void assignTreatmentPlan(Patient patient, TreatmentPlan treatmentPlan) {
        patient.setTreatmentPlan(treatmentPlan);
    }

    public void assignDoctor(Patient patient, TreatmentPlan treatmentPlan) {
        Doctor doctor;
        switch (treatmentPlan.getPlanCode()) {
            case 1 -> {
                doctor = new Surgeon("John");
                patient.setAssignedDoctor(doctor);
                doctor.treat();
            }
            case 2 -> {
                doctor = new Dentist("Jack");
                patient.setAssignedDoctor(doctor);
                doctor.treat();
            }
            default -> {
                doctor = new Therapist("Tomara");
                patient.setAssignedDoctor(doctor);
                doctor.treat();
            }
        }
    }
}
