package CH2;
import java.util.Scanner;

public class P3 {
    public static int a = 50000;
    public static int b = 10000;
    public static int c = 1000;
    public static int d = 100;
    public static int e = 50;
    public static int f = 10;
    public static int g = 1;

    public static void main(String[] args) {
        System.out.print("금액을 입력하시오>> ");
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        if(m>0)
            System.out.println("오만원권 "+m/a+"매");
        m-=a*(m/a);
        if(m>0)
            System.out.println("만원권 "+m/b+"매");
        m-=b*(m/b);
        if(m>0)
            System.out.println("천원권 "+m/c+"매");
        m-=c*(m/c);
        if(m>0)
            System.out.println("백원 "+m/d+"개");
        m-=d*(m/d);
        if(m>0)
            System.out.println("오십원 "+m/e+"개");
        m-=e*(m/e);
        if (m>0)
            System.out.println("십원 "+m/f+"개");
        m-=f*(m/f);
        if(m>0)
            System.out.println("일원 "+m/g+"개");
        m-=g*(m/g);
        if(m==0)
            s.close();
    }
}
