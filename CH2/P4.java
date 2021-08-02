package CH2;
import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("정수 3개 입력>> ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if((a>b&&a<c)||(a<b&&a>c))
            System.out.println("중간 값은 "+a);
        else if((b>a&&b<c)||(b<a&&b>c))
            System.out.println("중간 값은 "+b);
        else
            System.out.println("중간 값은 "+c);
    }
}
