package _02_condition_statement;

public class Operator {
    public static void main(String[] args) {
       // int x = 20;
        //int y = 18;
        //if (x>y){
        //   System.out.println("x>y:"+ (x-y));
        //}
      //  if (x<y){
       //     System.out.println("x<y:"+ (x-y));
        //    } else {
         //   System.out.println("x>y:"+ (x-y));
        //}
        int x = 20;
        int y = 10;
        if (x>y){
            System.out.println("good morning");
        } else {
            System.out.println("good evening");
        }
        String result = (x>y)? "good morning 3 ngoi" : "good evening 3 ngoi";
        System.out.println(result);
        String result1 = !(x>y)? "good morning 3 ngoi1" : "good evening 3 ngoi1";
        System.out.println(result1);
    }
}
