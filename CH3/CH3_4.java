package CH3;
import java.util.Scanner;

public class CH3_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>> ");
        String n = s.next();
        char alpha = n.charAt(0);
        for(char a = alpha;a>='a';a--)
        {
            for(char j = 'a';j<a+1;j++) //alpha값은 변하지 않는다. 반복문으로 변하는 것은 a
                System.out.print(j);
            System.out.println();
        }
    }
}
