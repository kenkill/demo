package _01_variable;

public class Example {
    public static void main(String[] args) {
        //variable
        int a = 1;
        String b = "demo";
        boolean c = false;
        float d = 1;
        double e = 2;
        char f = 'F';
        long g = 1;
        //constant gắn final vào không thay đổi được giá trị
        final int abc = 1;
        //operator number
        int numberA = 3;
        int numberB = 5;
        int numberC = numberA + numberB;
        int numberCC = 4 + 5;
        System.out.println(numberC);
        System.out.println(numberCC);
        System.out.println("Current value for sum: "+ numberCC);
        int numberD = numberB - numberA;
        System.out.println("Current value for subtract: "+ numberD);
        int numberE = numberB * numberA;
        System.out.println("Current value for multiply: "+ numberE);
        int numberG = numberB / numberA;
        System.out.println("Current value for integer: "+ numberG);
        int numberH = numberB % numberA;
        System.out.println("Current value for remainder: "+ numberH);
        //operator converter
        int aa= 10;
        int bb = 10+ 10;
        System.out.println("bb: "+ bb);
        aa+=10;
        //int aaa = aa+10;
        System.out.println("aa: "+ aa);
        int cc = 20;
        cc-=5;// cc = cc -5
        cc*=7;// cc = cc *5
        cc/=3;// cc = cc /3
        cc%=2;// cc = cc %2
        System.out.println("cc: "+ cc);
        int i = 1;
        int j = i + 1;
        System.out.println("j: "+ j);
        int ii = 1;
        int jj = ++ii;
        System.out.println("jj: "+ jj);
        int iii = 1;
        int jjj = iii++;
        System.out.println("iii: "+ iii);
        System.out.println("jjj: "+ jjj);
        //operator equals
        int oo = 10;
        int pp = 15;
        int ll = 10;
        //==
        System.out.println("Not equals: "+ (pp==oo));
        System.out.println("Equals: "+ (ll==oo));
        //!
        System.out.println("Not equals oo and pp: "+ !(pp==oo));
        //>=
        System.out.println("Greater than: "+ (pp>=oo));
        //<=
        System.out.println("Less than: "+ (ll<=pp));
        //operator logic
        int a1=10;
        int a2=20;
        int a3=30;
        boolean a4 = (a1>5 && a2 <10);//cả 2 đúng mới true
        System.out.println("a4: "+ a4);
        boolean a5 = (a1>5 && a2 <30);
        System.out.println("a5: "+ a5);
        boolean a6 = (a1>5 || a2 <10);
        System.out.println("a6: "+ a6);
    }
}
