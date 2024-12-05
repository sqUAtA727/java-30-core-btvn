package btvn5.Hospital;

import java.util.Arrays;

public class ManageHospital {
    public Doctor[] doctors;
    public Patient[] patients;

    public ManageHospital() {

    }

    public ManageHospital(Doctor[] doctors, Patient[] patients) {
        this.doctors = doctors;
        this.patients = patients;
    }

    public void displayAll() {
        System.out.println("Thong tin bac si:");
        for (Doctor doctor : doctors) {
            if (doctor != null) {
                doctor.displayInfo();
                System.out.println();
            }
        }

        System.out.println("Thong tin benh nhan:");
        for (Patient patient : patients) {
            if (patient != null) {
                patient.displayInfo();
                System.out.println();
            }
        }
    }
}
