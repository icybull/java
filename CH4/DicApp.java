package CH4;
import java.util.Scanner;

class Dictionary{
    private static String[] kor = {"사랑","아기","돈","미래","희망"};
    private static String[] eng = {"love","baby","money","future","hope"};
    public static String kor2Eng(String word){
        String out = "";
        for(int i=0;i<kor.length;i++)
        {
            if(kor[i].equals(word))
                out = eng[i];
        }
        return out;
    }
}

public class DicApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true)
        {
            System.out.print("한글 단어? ");
            String word = s.next();
            if(word.equals("그만")) break;
            String out = Dictionary.kor2Eng(word);
            if(out.equals(""))
                System.out.println(word+"는(은) 저의 사전에 없습니다.");
            else
                System.out.println(word+"는(은) 영어로 "+out+"입니다.");
        }
    }
}
