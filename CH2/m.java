package CH2;
import java.util.Scanner;

class p5{
    static void P5()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("정수 3개를 입력하시오>> ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a+b>c&&a+c>b&&b+c>a)
            System.out.println("삼각형이 됩니다.");
        else
            System.out.println("삼각형이 안됩니다.");
    }
}
class p6{
    static void P6()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("1~99사이의 정수를 입력하시오>>");
        int num = s.nextInt();
        int a = num/10;
        int b = num%10;
        if(a%3==0&&b%3==0)
            System.out.println("박수짝짝");
        else if((a%3==0&&b%3!=0)||(a%3!=0&&b%3==0))
            System.out.println("박수짝");
        else
            System.out.println("가만히 있으세요");
    }
    static void P7()/*(100,100)과(200,200)의 두점으로 이루어진 사각형이 있을 때, Scanner를 이용하여 정수 x와y 값을 입력받고 점 (x,y)가 이
              직사각형 안에 있는지를 판별하는 프로그램을 작성하라.*/
    {
        Scanner s = new Scanner(System.in);
        System.out.print("점 (x,y)의 좌표를 입력하시오>> ");
        int x = s.nextInt();
        int y = s.nextInt();
        if((x>=100&&x<=200)&&(y>=100&&y<=200))
            System.out.println("("+x+","+y+")는 사각형 안에 있습니다.");
        else
            System.out.println("("+x+","+y+")는 사각형 안에 없습니다.");
    }
    static boolean inRect(int x1, int y1, int x2, int y2)
    {
        if((x1>=100&&x1<=200&&y1>=100&&y1<=200)||(x2>=100&&x2<=200&&y2>=100&&y2<=200))
            return true;
        else
            return false;
    }
    static void P8()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("직사각형 구성하는 두 점 입력>> ");
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int x2 = s.nextInt();
        int y2 = s.nextInt();
        boolean A = p6.inRect(x1,y1,x2,y2);
        if(A)
            System.out.println("(100,100),(200,200)의 두 점으로 이루어진 직사각형이랑 충돌합니다.");
        else
            System.out.println("(100,100),(200,200)의 두 점으로 이루어진 직사각형이랑 충돌하지 않습니다.");
    }
}


public class m {
    public static void main(String[] args) {
      //p5.P5();
      //p6.P6();
      //p6.P7();
      //p6.P8();
    }
}
