
import java.time.YearMonth;
import java.util.Scanner;

public class exam4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------START PROGRAMING-------");

        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        System.out.println("Month = " + month + " year = " + year);
        YearMonth yearMonthObject = YearMonth.of(year, month);
        int dayOfMonth = yearMonthObject.lengthOfMonth();
        System.out.println("thang:"+ month  + "có"+ dayOfMonth +"ngay");

        System.out.println("-------END PROGRAMING-------");
    }
}
