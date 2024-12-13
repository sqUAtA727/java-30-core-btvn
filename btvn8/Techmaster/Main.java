package lesson8.btvn8.Techmaster;

import lesson8.btvn8.Techmaster.entity.Classroom;
import lesson8.btvn8.Techmaster.entity.Student;
import lesson8.btvn8.Techmaster.entity.Techmaster;
import lesson8.btvn8.Techmaster.service.StudentService;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student(001, "Chill", 27, "Kha");
        Student student2 = new Student(002, "Guy", 27, "Gioi");
        students.add(student1);
        students.add(student2);
        Classroom classroom = new Classroom("Subject", students);
        Techmaster techmaster = new Techmaster("NPC", "NPC", classroom);
        String condition = "";
        do {
            System.out.println("1- Hiển thị thông tin chi tiết của trung tâm\n" +
                    "2- Thực hiện thêm học viên vào lớp hiện tại\n" +
                    "3- Thực hiện cập nhật thông tin học lực của 1b học viên dựa vào Id\n" +
                    "4- Có 1 bạn xin nghỉ học, hãy giúp thầy xóa bạn đó khỏi lớp học\n");
            System.out.println("Nhap lua chon (1-4)");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println(techmaster);
                    break;
                case 2:
                    Student student = StudentService.inputInfo(scanner);
                    students.add(student);
                    break;
                case 3:
                    System.out.println("Nhap ID hoc vien can cap nhat: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    StudentService.updateInfo(scanner, id, students);
                    break;
                case 4:
                    System.out.println("Nhap ID hoc vien can xoa: ");
                    int id2 = Integer.parseInt(scanner.nextLine());
                    StudentService.removeStudent(scanner, id2, students);
                    break;
                default:
                    System.exit(0);
            }
            classroom = new Classroom("Subject", students);
            techmaster = new Techmaster("NPC", "NPC", classroom);
            System.out.println("Ban co muon tiep tuc khong (Y/N)");
            condition = scanner.nextLine();
        } while (Objects.equals(condition, "Y"));
    }
}
