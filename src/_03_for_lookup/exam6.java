package _03_for_lookup;

import java.util.Scanner;

public class exam6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap so n:");
        int n = scanner.nextInt();
        int ketQua = 1;
        for (int i=1;i<=n;i++)
            ketQua = ketQua*i;
                System.out.println("Ket qua la: " + ketQua);

        }
    }
