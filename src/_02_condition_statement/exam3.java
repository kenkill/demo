package _02_condition_statement;

import java.util.Scanner;

public class exam3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số kWh bạn phải trả: ");
        int soKwh = scanner.nextInt();
        double result = 0;
        if (soKwh >0 && soKwh <50){
            result = soKwh * 1678;
        }
    }
}
