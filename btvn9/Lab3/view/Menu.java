package lesson9.btvn9.Lab3.view;

import lesson9.btvn9.Lab3.entity.Worker;
import lesson9.btvn9.Lab3.service.WorkerService;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void displayMenu(){
        System.out.println("Worker Management");
        System.out.println("1. Add Worker");
        System.out.println("2. Up Salary");
        System.out.println("3. Down Salary");
        System.out.println("4. Display Information salary");
        System.out.println("5. Exit");
    }

    public void getMenuChoice(Scanner scanner, ArrayList<Worker> workers){
        WorkerService service = new WorkerService();
        int choose = 0;
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                Worker worker = service.getWorker(scanner);
                workers.add(worker);
                break;
            case 2:
                String type = "+";
                service.modifySalary(scanner, workers, type);
                break;
            case 3:
                type = "-";
                service.modifySalary(scanner, workers, type);
                break;
            case 4:
                System.out.println(workers);
                break;
            default:
                System.exit(0);
        }
    }
}
