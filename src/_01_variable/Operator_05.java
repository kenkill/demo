package _01_variable;

import java.util.Scanner;

public class Operator_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int b = scanner.nextInt();
        boolean c = (a>5 && b <0);
        System.out.println("a > 5 và b < 0: "+ c);
        boolean d = (a<=b && b <10);
        System.out.println("a <= b và b < 10: "+ d);
        boolean e = (a<10 || b >5);
        System.out.println("a < 10 hoặc b > 5: "+ e);
    }
}
