package _01_variable;

import java.util.Scanner;

public class Operator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int b = scanner.nextInt();

        int c =  a + b;
        System.out.println("Tong a va b: " + c);
        int d = a - b;
        System.out.println("Hieu a va b: " + d);
        int e = a*b;
        System.out.println("Tich a va b: " + e);
        int f = a/b;
        System.out.println("Chia lay phan nguyen: " + f);
        int g = a%b;
        System.out.println("Chia lay phan du: " + g);

    }
}
