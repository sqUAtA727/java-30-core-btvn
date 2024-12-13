package lesson8.btvn8.Techmaster.service;

import lesson8.btvn8.Techmaster.entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public static Student inputInfo(Scanner scanner) {
        System.out.println("Nhap ID:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap hoc luc: ");
        String studyAbility = scanner.nextLine();
        Student student = new Student(id, name, age, studyAbility);
        System.out.println("Them hoc sinh moi thanh cong: ");
        return student;
    }

    public static ArrayList<Student> updateInfo(Scanner scanner, int id, ArrayList<Student> students) {
        boolean condition = false;
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Nhap hoc luc moi: ");
                student.setStudyAbility(scanner.nextLine());
                System.out.println("Nhap hoc luc moi thanh cong");
                condition = true;
                break;
            }
        }
        if (!condition) {
            System.out.println("ID khong ton tai");
        }
        return students;
    }

    public static ArrayList<Student> removeStudent(Scanner scanner, int id2, ArrayList<Student> students) {
        boolean condition = false;
        for (Student student : students) {
            if (student.getId() == id2) {
                students.remove(student);
                System.out.println("Xoa hoc vien thanh cong: ");
                condition = true;
                break;
            }
        }
        if (!condition) {
            System.out.println("ID khong ton tai");
        }
        return students;
    }
}
