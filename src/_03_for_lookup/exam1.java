package _03_for_lookup;

import java.util.Scanner;

public class exam1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap so tu nguoi dung:");
        int n = scanner.nextInt();
        for (int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println("Uoc cua" +n +"la" +i);
            }
        }
    }
}
