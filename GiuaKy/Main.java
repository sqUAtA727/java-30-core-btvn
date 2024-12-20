package GiuaKy;

import GiuaKy.entity.Account;
import GiuaKy.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        ArrayList<Account> accounts = new ArrayList<>();
        while (true) {
            menu.displayMenu();
            menu.selectMenu(scanner, accounts);
        }
    }
}
