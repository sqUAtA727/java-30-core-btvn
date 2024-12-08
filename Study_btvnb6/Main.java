package lesson6.Study_btvnb6;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String condition;
        int numIT = 0;
        int numBiz = 0;
        ITStudent[] itStudents = new ITStudent[99];
        BizStudent[] bizStudents = new BizStudent[99];
        do {
            System.out.println("Nhap chuyen nganh sinh vien (IT/Biz): ");
            String major = scanner.nextLine();
            if (Objects.equals(major, "IT")){
                ITStudent itStudent = getITStudent(scanner, major);
                itStudents[numIT] = itStudent;
                numIT++;
            } else if (Objects.equals(major, "Biz")) {
                BizStudent bizStudent = getBizStudent(scanner, major);
                bizStudents[numBiz] = bizStudent;
                numBiz++;
            } else {
                System.out.println("Cu phap khong hop le, vui long thu lai");
            }
            System.out.println("Ban co muon tiep tuc khong (Y/N): ");
            condition = scanner.nextLine();
        } while (Objects.equals(condition, "Y"));
        if (numIT>0){
            for (int i = 0; i < numIT; i++) {
                System.out.println(itStudents[i]);
            }
        } else {
            System.out.println("Khong co sinh vien IT");
        }

        if (numBiz>0){
            for (int i = 0; i < numBiz; i++) {
                System.out.println(bizStudents[i]);
            }
        } else {
            System.out.println("Khong co sinh vien Biz");
        }
    }

    public static ITStudent getITStudent(Scanner scanner, String major){
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        double javaScore;
        while (true) {
            System.out.println("Nhap diem Java: ");
            javaScore = Double.parseDouble(scanner.nextLine());
            if (javaScore >= 0 && javaScore <= 10) {
                break;
            }
            System.out.println("Diem khong hop le. Vui long nhap lai (0-10): ");
        }
        double htmlScore;
        while (true) {
            System.out.println("Nhap diem HTML: ");
            htmlScore = Double.parseDouble(scanner.nextLine());
            if (htmlScore >= 0 && htmlScore <= 10) {
                break;
            }
            System.out.println("Diem khong hop le. Vui long nhap lai (0-10): ");
        }
        double cssScore;
        while (true) {
            System.out.println("Nhap diem CSS: ");
            cssScore = Double.parseDouble(scanner.nextLine());
            if (cssScore >= 0 && cssScore <= 10) {
                break;
            }
            System.out.println("Diem khong hop le. Vui long nhap lai (0-10): ");
        }
        return new ITStudent(name, major, javaScore, htmlScore, cssScore);
    }

    public static BizStudent getBizStudent(Scanner scanner, String major){
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        double markettingScore;
        while (true) {
            System.out.println("Nhap diem Marketting: ");
            markettingScore = Double.parseDouble(scanner.nextLine());
            if (markettingScore >= 0 && markettingScore <= 10) {
                break;
            }
            System.out.println("Diem khong hop le. Vui long nhap lai (0-10): ");
        }
        double salesScore;
        while (true) {
            System.out.println("Nhap diem Sales: ");
            salesScore = Double.parseDouble(scanner.nextLine());
            if (salesScore >= 0 && salesScore <= 10) {
                break;
            }
            System.out.println("Diem khong hop le. Vui long nhap lai (0-10): ");
        }
        return new BizStudent(name, major, markettingScore, salesScore);
    }
}
