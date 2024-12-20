package GiuaKy.service;

import GiuaKy.entity.Account;
import GiuaKy.view.Menu;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class AccountService {
    public void loginService(String username, String password, ArrayList<Account> accounts, Scanner scanner){
        Menu menu = new Menu();
        for (Account account : accounts){
            if (Objects.equals(account.getUsername(), username)){
                if (Objects.equals(account.getPassword(), password)){
                    System.out.println("Dang nhap thanh cong");
                    int logOut = 0;
                    while (logOut == 0){
                        menu.displayMainMenu(account.getUsername());
                        menu.mainSelectMenu(scanner, account, accounts, logOut);
                    }
                } else {
                    menu.wrongPasswordMenu(scanner, accounts);
                }
            } else {
                System.out.println("Kiem tra lai username");
            }
        }
    }

    public void registerService(String username, String email, String password, ArrayList<Account> accounts){
        String found = "false";
        for (Account account : accounts){
            if (Objects.equals(account.getUsername(), username)){
                System.out.println("Username da ton tai");
                found = "true";
                break;
            } else if (Objects.equals(account.getEmail(), email)){
                System.out.println("Email da ton tai");
                found = "true";
                break;
            }
        }
        if (found.equals("false")){
            System.out.println("Tao tai khoan moi thanh cong");
            accounts.add(new Account(username, email, password));
        }
    }

    public void resetPassword(Scanner scanner, ArrayList<Account> accounts){
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        String found = "false";
        for (Account account : accounts){
            if (Objects.equals(account.getEmail(), email)){
                System.out.println("Nhap mat khau moi: ");
                account.setPassword(scanner.nextLine());
                System.out.println("Doi mat khau thanh cong moi dang nhap lai");
                found = "true";
                break;
            }
        }
        if (found.equals("false")){
            System.out.println("Khong ton tai tai khoan");
        }
    }
    
    public void modifyAccount(Scanner scanner, ArrayList<Account> accounts, String type, Account account){
        String found = "false";
        if (Objects.equals(type, "username")){
            String username = scanner.nextLine();
            for (Account subAccount : accounts) {
                if (Objects.equals(subAccount.getUsername(), username)){
                    System.out.println("Username da ton tai");
                    found = "true";
                    break;
                }
            }
            if (found.equals("false")){
                account.setUsername(username);
                System.out.println("Doi username thanh cong");
            }
        } else if (Objects.equals(type, "email")){
            String email = scanner.nextLine();
            for (Account subAccount : accounts) {
                if (Objects.equals(subAccount.getUsername(), email)){
                    System.out.println("Email da ton tai");
                    found = "true";
                    break;
                }
            }
            if (found.equals("false")){
                account.setEmail(email);
                System.out.println("Doi email thanh cong");
            }
        } else {
            account.setPassword(scanner.nextLine());
            System.out.println("Doi password thanh cong");
        }
    }
}
