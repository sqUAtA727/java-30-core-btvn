package lesson9.btvn9.Lab4.view;

import lesson9.btvn9.Lab4.entity.Worker;
import lesson9.btvn9.Lab4.service.WorkerService;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void displayMenu() {
        System.out.println("Nhap lua chon");
        System.out.println("1. Nhap va xuat danh sach nhan vien");
        System.out.println("2. Xoa nhan vien");
        System.out.println("3. Cap nhat thong tin nhan vien");
        System.out.println("4. Tim nhan vien theo luong");
        System.out.println("5. Sap xep nhan vien theo ho ten hoac thu nhap");
        System.out.println("6. Xuat 5 nhan vien thu nhap cao nhat cong ty");
        System.out.println("7. Ket thuc chuong trinh");
    }

    public void menuChoose(Scanner scanner, ArrayList<Worker> workers) {
        WorkerService workerService = new WorkerService();
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                workerService.getWorker(scanner, workers);
                System.out.println(workers);
                break;
            case 2:
                String type = "remove";
                workerService.modifyWorker(scanner, workers, type);
                break;
            case 3:
                type = "update";
                workerService.modifyWorker(scanner, workers, type);
                break;
            case 4:
                workerService.findWorkerSalaryType(scanner, workers);
                break;
            case 5:
                System.out.println("Em chiu");
                break;
            case 6:
                System.out.println("Em chiu");
                break;
            default:
                System.exit(0);
                break;
        }
    }
}
