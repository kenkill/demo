package _02_condition_statement;

import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int b = scanner.nextInt();
        if(a%b==0){
            System.out.println("a chia het cho b");
        } else {
            System.out.println("a khong chia het cho b");
        }
    }
}
