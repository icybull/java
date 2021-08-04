package CH4;
import java.util.Scanner;

class Phone{
    private String name;
    private String tel;
    Phone(String name, String tel)
    {
        this.name=name;
        this.tel=tel;
    }
    public String getName(){return name;}
    public String getTel(){return tel;}
}
public class PhoneBook {
    private Phone[] myPhone;
    PhoneBook(int num)
    {
        myPhone = new Phone[num];
    }
    Phone[] get(){return myPhone;}

        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("인원 수>> ");
        int num = s.nextInt();
        PhoneBook myPB = new PhoneBook(num);
        for(int i=0;i<myPB.get().length;i++)
        {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>> ");
            String name = s.next();
            String tel = s.next();
            myPB.get()[i] = new Phone(name,tel);
        }
            System.out.println("저장되었습니다...");
        OUTER:while(true)
        {
            System.out.print("검색할 이름>> ");
            String name = s.next();
            if(name.equals("그만")) break;
            for(int i=0;i<myPB.get().length;i++)
            {
                if(myPB.get()[i].getName().equals(name))
                {
                    System.out.println(myPB.get()[i].getName()+"의 번호는 "+myPB.get()[i].getTel()+" 입니다.");
                    continue OUTER;
                }
            }
            System.out.println(name+"  없습니다.");
        }
    }
}
