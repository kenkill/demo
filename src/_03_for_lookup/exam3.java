package _03_for_lookup;

import java.util.Scanner;

public class exam3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap so a:");
        int a = scanner.nextInt();
        System.out.println("Nhap so b:");
        int b = scanner.nextInt();
        int ucln = 0;
        for (int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0)
                ucln = i;
        }
                System.out.println("Uoc chung lon nhat cua a va b la :" +ucln);

    }
}
