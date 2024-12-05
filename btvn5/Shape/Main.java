package btvn5.Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        System.out.println("Nhap chieu dai hinh chu nhat: ");
        rectangle.setLength(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhap chieu rong hinh chu nhat: ");
        rectangle.setWidth(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhap canh hinh vuong: ");
        square.setSide(Double.parseDouble(scanner.nextLine()));
        System.out.println("Chu vi hinh chu nhat la: "+rectangle.calcPerimeter());
        System.out.println("Dien tich hinh chu nhat la: "+rectangle.calcArea());
        System.out.println("Chu vi hinh vuong la: "+square.calcPerimeter());
        System.out.println("Dien tich hinh vuong la: "+square.calcArea());
    }

}
