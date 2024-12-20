package GiuaKy.view;

import GiuaKy.entity.Account;
import GiuaKy.service.AccountService;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    AccountService service = new AccountService();

    public void displayMenu() {
        System.out.println("1 - Đăng nhập\n" +
                "2 - Đăng ký");
    }

    public void selectMenu(Scanner scanner, ArrayList<Account> accounts) {
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                loginMenu(scanner, accounts);
                break;
            case 2:
                registerMenu(scanner, accounts);
                break;
            case 3:
                System.out.println(accounts);
                break;
            default:
                break;
        }
    }

    public void loginMenu(Scanner scanner, ArrayList<Account> accounts) {
        System.out.println("Nhap username");
        String username = scanner.nextLine();
        System.out.println("Nhap password: ");
        String password = scanner.nextLine();
        service.loginService(username, password, accounts, scanner);
    }

    public void registerMenu(Scanner scanner, ArrayList<Account> accounts) {
        System.out.println("Nhap username: ");
        String username = scanner.nextLine();
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        System.out.println("Nhap password");
        String password = scanner.nextLine();
        service.registerService(username, email, password, accounts);
    }

    public void wrongPasswordMenu(Scanner scanner, ArrayList<Account> accounts) {
        System.out.println("1 - Đăng nhập lai\n" +
                "2 - Quen mat khau");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                loginMenu(scanner, accounts);
                break;
            case 2:
                service.resetPassword(scanner, accounts);
                break;
            default:
                break;
        }
    }

    public void displayMainMenu(String username) {
        System.out.println("Chào mừng " + username + ", bạn có thể thực hiện các công việc sau:");
        System.out.println("1 - Thay đổi username\n" +
                "2 - Thay đổi email\n" +
                "3 - Thay đổi mật khẩu\n" +
                "4 - Đăng xuất (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng ký)\n" +
                "0 - Thoát chương trình");
    }

    public void mainSelectMenu(Scanner scanner, Account account, ArrayList<Account> accounts, int logOut) {
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Nhap username moi: ");
                String type = "username";
                service.modifyAccount(scanner, accounts, type, account);
                break;
            case 2:
                System.out.println("Nhap email moi: ");
                type = "email";
                service.modifyAccount(scanner, accounts, type, account);
                break;
            case 3:
                System.out.println("Nhap password moi: ");
                type = "password";
                service.modifyAccount(scanner, accounts, type, account);
                break;
            case 4:
                System.out.println("Dang xuat thanh cong");
                while (true){
                    displayMenu();
                    selectMenu(scanner, accounts);
                }
            case 5:
                System.out.println(accounts);
                break;
            default:
                System.exit(0);
        }
    }
}
