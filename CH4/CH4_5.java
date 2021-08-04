package CH4;
import java.util.Scanner;

class Circle{
    final static double PI = 3.14;
    private double x,y;
    private int radius;
    public Circle(double x, double y, int radius)
    {
        this.x= x; this.y =y;
        this.radius = radius;
    }
    public void show()
    {
        System.out.println("("+x+","+y+")"+radius);
    }
    double area()
    {
        double area = PI*radius*radius;
        return area;
    }
}

public class CH4_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Circle[] c = new Circle[3];
        for(int i = 0;i<c.length;i++)
        {
            System.out.print("x,y,radius >> ");
            double x = s.nextDouble();
            double y = s.nextDouble();
            int radius = s.nextInt();
            c[i] = new Circle(x,y,radius);
        }
        for(int j=0;j<c.length;j++) c[j].show();
        s.close();
    }
}
