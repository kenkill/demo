package _03_for_lookup;

import java.util.Scanner;

public class exam2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap so duong:");
        int i = scanner.nextInt();
        while (i>0){
            System.out.println(i+ "la so duong");
            System.out.println("Nhap tiep so duong");
            i = scanner.nextInt();
        }
        System.out.println("So da nhap khong thoa man:" +i);
    }
}
