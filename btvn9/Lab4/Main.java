package lesson9.btvn9.Lab4;

import lesson9.btvn9.Lab4.entity.Worker;
import lesson9.btvn9.Lab4.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        ArrayList<Worker> workers = new ArrayList<>();
        while (true) {
            menu.displayMenu();
            menu.menuChoose(scanner, workers);
        }
    }
}
