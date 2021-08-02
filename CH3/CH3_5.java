package CH3;
import java.util.Scanner;

public class CH3_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("양의 정수 10개를 입력하시오>> ");
        int [] n = new int[10];
        for(int i =0;i<n.length;i++)
            n[i]=s.nextInt();
        System.out.print("3의 배수는 ");
        for(int j=0;j<n.length;j++)
        {
            if(n[j]%3==0)
                System.out.print(" "+n[j]);
        }
    }
}
