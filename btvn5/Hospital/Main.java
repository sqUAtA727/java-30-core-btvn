package btvn5.Hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Doctor[] doctors = new Doctor[1];
        Patient[] patients = new Patient[1];
        Scanner scanner = new Scanner(System.in);
        Doctor doctor = new Doctor();
        Patient patient = new Patient();
        System.out.println("Nhap ten bac si");
        doctor.setName(scanner.nextLine());
        System.out.println("Nhap tuoi: ");
        doctor.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap chuyen khoa: ");
        doctor.setSpecializecation(scanner.nextLine());
        System.out.println("Nhap so gio lam viec (Tu khi vao lam o vien): ");
        doctor.setWorkingHours(Integer.parseInt(scanner.nextLine()));
        patientInfo(patient, scanner);
        doctors[0] = doctor;
        patients[0] = patient;
        display(doctor, patient, doctors, patients);
    }

    public static void patientInfo(Patient patient, Scanner scanner) {
        System.out.println("Nhap ten benh nhan");
        patient.setName(scanner.nextLine());
        System.out.println("Nhap tuoi: ");
        patient.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap so benh an: ");
        patient.setCaseNum(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap ngay nhap vien (dd/mm/yyyy): ");
        patient.setDateJoin(scanner.nextLine());
    }

    public static void display (Doctor doctor, Patient patient, Doctor[] doctors, Patient[] patients) {
        ManageHospital hospital = new ManageHospital(doctors, patients);
        hospital.displayAll();
    }
}
