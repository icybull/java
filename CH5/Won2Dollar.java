package CH5;
import java.util.Scanner;

abstract class Converter{
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;
    public void run(){
        Scanner s = new Scanner(System.in);
        System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
        System.out.print(getSrcString()+"을 입력하세요>> ");
        double val = s.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: "+res+getDestString()+"입니다.");
        s.close();
    }
}

public class Won2Dollar extends Converter{
    private int money;
    Won2Dollar(int money){
        this.money = money;
    }
    @Override
    protected double convert(double src){ return src/money; }
    @Override
    protected String getSrcString(){ return "원"; }
    @Override
    protected String getDestString(){ return "달러"; }
    public static void main(String[] args) {
        Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
        toDollar.run();
    }
}
