package CH2;
import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        System.out.print("첫번째 원의 중심과 반지름 입력>> ");
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        double r1 = s.nextDouble();
        System.out.print("두번째 원의 중심과 반지름 입력>> ");
        int x2 = s.nextInt();
        int y2 = s.nextInt();
        double r2 = s.nextDouble();
        int distance = ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
        if(r1+r2>=Math.sqrt(distance))
            System.out.println("두 원은 서로 겹친다.");
        else
            System.out.println("두 원은 서로 안겹친다.");
    }
}
