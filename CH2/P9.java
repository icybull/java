package CH2;
import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("원의 중심과 반지름 입력>> ");
        int x = s.nextInt();
        int y = s.nextInt();
        double r = s.nextDouble();
        System.out.print("점 입력>> ");
        int x2 = s.nextInt();
        int y2 = s.nextInt();
        if((x2<=x+r&&x2>=x-r)&&(y2<=y+r&&y2>=y-r))
            System.out.println("점 ("+(double)x2+","+(double)y2+")는 원 안에 있다.");
        else
            System.out.println("점 ("+(double)x2+","+(double)y2+")는 원 안에 없다.");
        s.close();
    }
}
