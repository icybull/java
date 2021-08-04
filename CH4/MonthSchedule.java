package CH4;
import java.util.Scanner;

class Day{
    private String work; // 하루의 할 일을 나타내는 문자열
    public void set(String work){ this.work = work; }
    public String get(){ return work;}
    public void show(){
        if(work == null) System.out.println("없습니다.");
        else System.out.println(work+"입니다.");
    }
}

public class MonthSchedule {
    private Day[] myDay;
    MonthSchedule(int day)
    {
        myDay = new Day[day];
        for(int i=0;i< myDay.length;i++)
            myDay[i] = new Day();
    }

    void run(){
        Scanner s = new Scanner(System.in);
        System.out.println("이번달 스케쥴 관리 프로그램. ");
        while(true)
        {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
            int n = s.nextInt();
            if(n==1)
            {
                System.out.print("날짜(1~30)? ");
                int day = s.nextInt();
                System.out.print("할일(빈칸없이 입력)? ");
                String work = s.next();
                myDay[day].set(work);
            }
            else if(n==2)
            {
                System.out.print("날짜(1~30)? ");
                int day = s.nextInt();
                System.out.print(day+"의 할 일은 ");
                myDay[day].show();
            }
            else if(n==3)
            {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else
            {
                System.out.println("다시 입력하세요");
                continue;
            }
        }
    }
    public static void main(String[] args) {
        MonthSchedule april = new MonthSchedule(30); //4월달에 할 일
        april.run();
    }
}
