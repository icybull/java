package CH3;
import java.util.Scanner;

public class CH3_3 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하시오>> ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i=num;i>0;i--)
        {
            for(int j=0;j<i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
