package CH5;

public class IPTV extends ColorTV{
    private String adr;
    IPTV(String adr, int inch,int col)
    {
        super(inch,col);
        this.adr = adr;
    }
    String getAdr(){ return adr; }
    @Override
    public void printProperty()
    {
        System.out.println("나의 IPTV는 "+getAdr()+"주소의 "+getSize()+"인치 "+getCol()+"컬러");
    }
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2",32,2048);
        iptv.printProperty();
    }
}
