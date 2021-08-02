package CH2;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        System.out.print("2자리수 정수 입력(10~99)>> ");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        if(n/10==n%10)
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        else
            System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
    }
}
