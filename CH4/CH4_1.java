package CH4;
class TV{
    private String manu;
    private int year;
    private int inch;
    TV(String manu,int year,int inch)
    {
        this.manu = manu; this.year = year;
        this.inch = inch;
    }
    void show(){
        System.out.println(manu+"에서 만든 "+year+"년형 "+inch+"인치 TV ");
    }
}

public class CH4_1 {
    public static void main(String[] args) {
        TV myTV = new TV("LG",2017,32); // LG에서 만든 2017년 32인치
        myTV.show();
    }
}