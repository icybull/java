package CH5;

public class ColorPoint extends Point{
    public String color;
    public ColorPoint()
    {
        super(0,0);
        this.color = "BLACK";
    }
    public ColorPoint(int x, int y)
    {
        super(x,y);
        this.color = "BLACK";
    }
    public ColorPoint(int x, int y, String color)
    {
        super(x,y);
        this.color = color;
    }
    void setXY(int x, int y){ move(x,y); }
    void setColor(String color){ this.color = color; }
    protected String getColor(){ return color; }
    @Override
    public String toString() { return color+"색의 ("+getX()+","+getY()+")의 점"; }

    /*public static void main(String[] args) {
        ColorPoint cp= new ColorPoint(5,5,"YELLOW");
        cp.setXY(10,20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str +"입니다.");
        System.out.println(cp +"입니다.");
    }*/
    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint();// (0,0)위치의 BLACK 색 점
        System.out.println(zeroPoint.toString() + "입니다.");

        ColorPoint cp = new ColorPoint(10,10);// (10,10) 위치의 BLACK 색 점
        cp.setXY(5,5);
        cp.setColor("RED");
        System.out.println(cp.toString() +"입니다.");

    }
}
