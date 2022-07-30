package com.teachmeskills.lesson8.clinic;

public class Patient {
    private String name;
    private TreatmentPlan treatmentPlan;
    private Doctor assignedDoctor;

    public Patient(String name, TreatmentPlan treatmentPlan) {
        this.name = name;
        this.treatmentPlan = treatmentPlan;
    }

    public Patient(String name) {
        this.name = name;
    }

    public Patient() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }

    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(Doctor assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }
}
