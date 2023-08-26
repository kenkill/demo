package _02_condition_statement;

import java.util.Scanner;
import java.time.YearMonth;
public class exam5 {
    public static void main(String[] args) {
        //nhap vao thang trong nam
        //in ra thang do thuoc mua nao trong nam
        //input: thang 4
        //output: thang 4 thuoc mua he
       //neu thang do thuoc mua he thi nhap nam vao
        //in ra thang do co bao nhieu ngay
        //input: thang 6
        //nhap them nam
        // in ra thang do co bao nhieu ngay
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap thang: ");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("thang:" + month +"thuoc mua xuan");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("thang:" + month +"thuoc mua he");
                System.out.print("Nhap nam: ");
                int year = scanner.nextInt();
                YearMonth yearMonthObject = YearMonth.of(year, month);
                int dayOfMonth = yearMonthObject.lengthOfMonth();
                System.out.println("thang:" + dayOfMonth +"ngay");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("thang:" + month +"thuoc mua thu");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("thang:" + month +"thuoc mua dong");
                break;
        }
    }
}
