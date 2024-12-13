package lesson8.btvn8.Family;

import lesson8.btvn8.Family.entity.Family;
import lesson8.btvn8.Family.entity.Member;
import lesson8.btvn8.Family.service.FamilyService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thanh vien gia dinh: ");
        int memberNum = Integer.parseInt(scanner.nextLine());
        ArrayList<Member> members = new ArrayList<>();

        System.out.println("Nhap id ho dan: ");
        int idFml = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so nha: ");
        int numberHouse = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < memberNum; i++) {
            Member member = FamilyService.inputInfo(i, scanner);
            members.add(member);
        }
        Family family = new Family(idFml, numberHouse, members);
        System.out.println(family);
    }
}