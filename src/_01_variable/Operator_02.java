package _01_variable;

import java.time.LocalDate;
import java.util.Scanner;

public class Operator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap nam sinh: ");
        int birthYear = scanner.nextInt();
        LocalDate localDate = LocalDate.now();
        final int currentYear = localDate.getYear();
        System.out.println("Nam hien tai: " + currentYear);
        int currentAge = currentYear - birthYear;
        System.out.println("Tuoi: " + currentAge);
    }
}
