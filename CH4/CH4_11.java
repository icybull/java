package CH4;
import java.util.Scanner;

class Add{
    private int a;
    private int b;
    public void setValue(int a, int b){
        this.a=a; this.b=b;
    }
    public int calculate(){
        return a+b;
    }
}
class Sub{
    private int a;
    private int b;
    public void setValue(int a, int b){
        this.a=a; this.b=b;
    }
    public int calculate(){
        return a-b;
    }
}
class Mul{
    private int a;
    private int b;
    public void setValue(int a, int b){
        this.a=a; this.b=b;
    }
    public int calculate(){
        return a*b;
    }
}
class Div{
    private int a;
    private int b;
    public void setValue(int a, int b){
        this.a=a; this.b=b;
    }
    public int calculate() throws Exception{
        return a/b;
    }
}
public class CH4_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오>> ");
        int a = s.nextInt();
        int b = s.nextInt();
        String c = s.next();
            switch (c) {
                case ("+"): {
                    Add A = new Add();
                    A.setValue(a, b);
                    int d = A.calculate();
                    System.out.println(d);
                    break;
                }
                case ("-"): {
                    Sub S = new Sub();
                    S.setValue(a, b);
                    int d = S.calculate();
                    System.out.println(d);
                    break;
                }
                case ("*"): {
                    Mul M = new Mul();
                    M.setValue(a, b);
                    int d = M.calculate();
                    System.out.println(d);
                    break;
                }
                case ("/"): {
                    Div D = new Div();
                    D.setValue(a, b);
                    try {
                        int d = D.calculate();
                        System.out.println(d);
                        break;
                    } catch (Exception e) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        break;
                    }
                }
                default:
                    System.out.println("계산 불가");
            }
    }
}
