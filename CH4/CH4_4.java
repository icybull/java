package CH4;

class Rectangle{
    int x;
    int y;
    int width;
    int height;
    Rectangle(int x,int y,int width,int height)
    {
        this.x = x; this.y = y;
        this.width = width; this.height = height;
    }
    int square()
    {
        int square = height*width;
        return square;
    }
    void show()
    {
        System.out.println("(" + x + "," + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
    }
    boolean contains(Rectangle r)
    {
       if(this.x<r.x&&this.x+this.width>r.x+r.width&&this.y<r.y&&r.y+r.height<this.y+this.height) return true;
       else return false;
    }
}

public class CH4_4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,2,8,7);
        Rectangle s = new Rectangle(5,5,6,6);
        Rectangle t = new Rectangle(1,1,12,12);

        r.show();
        System.out.println("s의 면적은 "+s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }
}
