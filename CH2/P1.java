package CH2;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        System.out.print("원화를 입력하세요(단위 원)>> ");
        Scanner s = new Scanner(System.in);
        int won=s.nextInt();
        double dollar=(double)won/1100;
        System.out.println(won+"원은 $"+Math.round(dollar*10)/10.0+"입니다.");
    }
}
