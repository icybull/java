package CH2;
import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        System.out.print("연산>> ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String b = s.next();
        int c = s.nextInt();
        if(b.equals("+"))
            System.out.println(a+b+c+"의 계산 결과는 "+(a+c));
        else if(b.equals("="))
            System.out.println(a+b+c+"의 계산 결과는 "+(a==c));
        else if(b.equals("/"))
        {
            if(c==0)
                System.out.println("0으로 나눌 수 없습니다.");
            else
                System.out.println(a+b+c+"의 계산 결과는 "+(a/c));
        }
        else if(b.equals("*"))
            System.out.println(a+b+c+"의 계산 결과는 "+(a*c));
        else
            System.out.println("계산불가");
    }
}
