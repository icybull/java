package CH4;
import java.util.Scanner;

class ReserveSystem{
    private static String[] S;
    private static String[] A;
    private static String[] B;
    ReserveSystem(){
        S = new String[10];
        A = new String[10];
        B = new String[10];
        for(int i=0;i<10;i++)
        {
            S[i] = "---";
            A[i] = "---";
            B[i] = "---";
        }
    }
    static String[] getS(){return S;}
    static String[] getA(){return A;}
    static String[] getB(){return B;}
    void reserve(int a, int b, String name)
    {
        if(a==1)
        {
            if(S[b].equals("---")) S[b] = name;
            else System.out.println("이미 예약되어있습니다.처음으로 돌아갑니다.");
        }
        else if(a==2)
        {
            if(A[b].equals("---")) A[b] = name;
            else System.out.println("이미 예약되어있습니다.처음으로 돌아갑니다.");
        }
        else
        {
            if(B[b].equals("---")) B[b] = name;
            else System.out.println("이미 예약되어있습니다.처음으로 돌아갑니다.");
        }
    }

}
class ShowSystem{
    public void show_S()
    {
        System.out.print("S>> ");
        for(int i=0;i<10;i++) System.out.print(ReserveSystem.getS()[i]+" ");
        System.out.println();
    }
    public void show_A()
    {
        System.out.print("A>> ");
        for(int i=0;i<10;i++) System.out.print(ReserveSystem.getA()[i]+" ");
        System.out.println();
    }
    public void show_B()
    {
        System.out.print("B>> ");
        for(int i=0;i<10;i++) System.out.print(ReserveSystem.getB()[i]+" ");
        System.out.println();
    }
}
class CancelSystem{
    void cancel(int a, String name)
    {
        if(a==1)
        {
            for(int i=0;i<ReserveSystem.getS().length;i++)
            {
                if(ReserveSystem.getS()[i].equals(name))
                    ReserveSystem.getS()[i] = "---";
            }
        }
        else if(a==2)
        {
            for(int i=0;i<ReserveSystem.getA().length;i++)
            {
                if(ReserveSystem.getA()[i].equals(name))
                    ReserveSystem.getA()[i] = "---";
            }
        }
        else
        {
            for(int i=0;i<ReserveSystem.getB().length;i++)
            {
                if(ReserveSystem.getB()[i].equals(name))
                    ReserveSystem.getB()[i] = "---";
            }
        }
    }
}


public class ReserveApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ShowSystem SS = new ShowSystem();
        CancelSystem CS = new CancelSystem();
        ReserveSystem RS = new ReserveSystem();
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        while(true)
        {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
            int num = s.nextInt();
            if(num==4)
                break;
            switch(num){
                case 1:
                    System.out.print("좌석구분 S(1), A(2), B(3)>> ");
                    int seat_class = s.nextInt();
                    if(seat_class==1)
                    {
                        SS.show_S();
                        System.out.print("이름>> ");
                        String seat_name = s.next();
                        System.out.print("번호>> ");
                        int seat_num = s.nextInt();
                        RS.reserve(seat_class,seat_num,seat_name);
                    }
                    else if(seat_class==2)
                    {
                        SS.show_A();
                        System.out.print("이름>> ");
                        String seat_name = s.next();
                        System.out.print("번호>> ");
                        int seat_num = s.nextInt();
                        RS.reserve(seat_class,seat_num,seat_name);
                    }
                    else if (seat_class==3)
                    {
                        SS.show_B();
                        System.out.print("이름>> ");
                        String seat_name = s.next();
                        System.out.print("번호>> ");
                        int seat_num = s.nextInt();
                        RS.reserve(seat_class,seat_num,seat_name);
                    }
                    else
                        System.out.println("잘못입력하셨습니다. 처음으로 돌아갑니다.");
                    break;
                case 2:
                    SS.show_S();
                    SS.show_A();
                    SS.show_B();
                    System.out.println("<<<조회를 완료하였습니다.>>>");
                    break;
                case 3:
                    System.out.print("좌석 S:1, A:2, B:3>> ");
                    int n = s.nextInt();
                    if(n==1)
                    {
                        SS.show_S();
                        System.out.print("이름>> ");
                        String name = s.next();
                        CS.cancel(n,name);
                    }
                    else if(n==2)
                    {
                        SS.show_A();
                        System.out.print("이름>> ");
                        String name = s.next();
                        CS.cancel(n,name);
                    }
                    else if(n==3)
                    {
                        SS.show_B();
                        System.out.print("이름>> ");
                        String name = s.next();
                        CS.cancel(n,name);
                    }
                    else
                        System.out.println("잘못입력하셨습니다. 처음으로 돌아갑니다.");
                    break;
                default:
                    System.out.println("다시 입력하세요 ");
            }
        }
    }
}
