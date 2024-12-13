package lesson8.btvn8.Family.service;

import lesson8.btvn8.Family.entity.Member;

import java.util.Scanner;

public class FamilyService {
    public static Member inputInfo(int i, Scanner scanner){
        System.out.println("Nhap thong tin thanh vien thu "+(i+1));
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap cong viec: ");
        String job = scanner.nextLine();
        Member member = new Member(id, name, job);
        return member;
    }
}
