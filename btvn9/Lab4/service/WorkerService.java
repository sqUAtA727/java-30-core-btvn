package lesson9.btvn9.Lab4.service;

import lesson9.btvn9.Lab4.entity.Boss;
import lesson9.btvn9.Lab4.entity.MarketingWorker;
import lesson9.btvn9.Lab4.entity.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerService {
    public void getWorker(Scanner scanner, ArrayList<Worker> workers) {
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap luong (USD): ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap loai nhan vien (Cac so khac se mac dinh la nhan vien thuong)");
        System.out.println("1. Nhan vien thuong");
        System.out.println("2. Nhan vien tiep thi");
        System.out.println("3. Truong phong");
        int workerChoose = Integer.parseInt(scanner.nextLine());
        switch (workerChoose) {
            case 2:
                System.out.println("Nhap doanh so ban hang");
                int salesVol = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhap luong thuong (Theo phan tram luong thang: 0-100%): ");
                double bonusRate = Double.parseDouble(scanner.nextLine()) / 100;
                MarketingWorker marketingWorker = new MarketingWorker(name, salary, salesVol, bonusRate);
                workers.add(marketingWorker);
                break;
            case 3:
                System.out.println("Nhap luong trach nghiem: ");
                double bossExtraSalary = Double.parseDouble(scanner.nextLine());
                Boss boss = new Boss(name, salary, bossExtraSalary);
                break;
            default:
                Worker worker = new Worker(name, salary);
                workers.add(worker);
                break;
        }
    }

    public void modifyWorker(Scanner scanner, ArrayList<Worker> workers, String type) {
        System.out.println("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Worker worker : workers) {
            if (worker.getId() == id) {
                if (type == "remove") {
                    workers.remove(worker);
                } else {
                    System.out.println("Nhap luong moi: ");
                    worker.setSalary(Double.parseDouble(scanner.nextLine()));
                }
            }
        }
    }

    public void findWorkerSalaryType(Scanner scanner, ArrayList<Worker> workers){
        System.out.println("Chi tim duoc theo luong thang khong tinh luong them");
        System.out.println("He thong se mac dinh tim nhan vien voi so luong cao hon hoac bang con so ban nhap");
        System.out.println("Nhap so luong");
        double salary = Double.parseDouble(scanner.nextLine());
        for (Worker worker : workers){
            if (worker.getSalary()>=salary){
                System.out.println(worker);
            }
        }
    }
}
