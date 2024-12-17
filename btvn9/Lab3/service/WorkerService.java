package lesson9.btvn9.Lab3.service;

import lesson9.btvn9.Lab3.entity.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerService {
    public Worker getWorker(Scanner scanner) {
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Salary (USD): ");
        double salary = Integer.parseInt(scanner.nextLine());
        System.out.println("Workplace");
        String workPlace = scanner.nextLine();
        return new Worker(name, age, salary, workPlace);
    }

    public void modifySalary(Scanner scanner, ArrayList<Worker> workers, String type) {
        System.out.println("Type the worker's id you wanted to add salary");
        int id = Integer.parseInt(scanner.nextLine());
        for (Worker worker : workers) {
            if (worker.getId() == id) {
                if (type == "+") {
                    System.out.println("Type ammount of salary you wanted to add: ");
                    double salaryAmmount = Double.parseDouble(scanner.nextLine());
                    worker.setSalary(worker.getSalary() + salaryAmmount);
                } else {
                    System.out.println("Type ammount of salary you wanted to down: ");
                    double salaryAmmount = Double.parseDouble(scanner.nextLine());
                    worker.setSalary(worker.getSalary() - salaryAmmount);
                }
                break;
            }
        }
    }
}
