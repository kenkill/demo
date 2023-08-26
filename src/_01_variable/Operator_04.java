package _01_variable;

import java.util.Scanner;

public class Operator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int b = scanner.nextInt();
        System.out.println("a bằng b: "+ (a==b));
        System.out.println("a khác b: "+ (a!=b));
        System.out.println("a > b: "+ (a>b));
        System.out.println("a < b: "+ (a<b));
        System.out.println("a >= b: "+ (a>=b));
        System.out.println("a <= b: "+ (a<=b));
    }
}
