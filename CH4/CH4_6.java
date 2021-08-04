package CH4;

import java.util.Scanner;

public class CH4_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Circle[] c = new Circle[3];
        for (int i = 0; i < c.length; i++) {
            System.out.print("x,y,radius >> ");
            double x = s.nextDouble();
            double y = s.nextDouble();
            int radius = s.nextInt();
            c[i] = new Circle(x, y, radius);
        }
        if(c[0].area()>c[1].area()&&c[0].area()>c[2].area()) {System.out.print("가장 면적이 큰 원은 ");c[0].show();}
        else if(c[1].area()>c[0].area()&&c[1].area()>c[2].area()) {System.out.print("가장 면적이 큰 원은 ");c[1].show();}
        else {System.out.print("가장 면적이 큰 원은 ");c[2].show();}
        s.close();
    }
}
