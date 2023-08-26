package _02_condition_statement;

import java.util.Scanner;

public class exam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        float a = scanner.nextFloat();
        System.out.println("Nhập vào số thứ hai: ");
        float b = scanner.nextFloat();
        System.out.println("Nhập vào số thứ ba: ");
        float c = scanner.nextFloat();
        //if(a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a){
        //    System.out.println("a,b,c la 3 canh cua tam giac");
       // } else {
        //    System.out.println("a,b,c khong la 3 canh cua tam giac");
        //}
        boolean compareFirst = a > 0 && b > 0 && c > 0;
        boolean compareSecond = a+b>c && a+c>b && b+c>a;
        if ( compareFirst && compareSecond){
            System.out.println("a,b,c la 3 canh cua tam giac");
        } else {
            System.out.println("a,b,c khong la 3 canh cua tam giac");
        }
    }
}

