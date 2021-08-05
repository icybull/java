package CH5;

public class Point3D extends Point{
    private int z;
    public Point3D(int x, int y, int z)
    {
        super(x,y);
        this.z = z;
    }
    protected void move(int x, int y, int z)
    {
       move(x,y);
       this.z = z;
    }
    protected int getZ(){ return z; }
    @Override
    public String toString(){ return "("+getX()+","+getY()+","+getZ()+")의 점";}
    protected void moveUp(){ z +=1; }
    protected void moveDown(){ z -=1; }
    public static void main(String[] args) {
        Point3D p = new Point3D(1,2,3); // 1,2,3은 각각 x,y,z의 값.
        System.out.println(p.toString() + "입니다.");

        p.moveUp();
        System.out.println(p.toString() + "입니다.");
        p.moveDown();
        p.move(10,10);
        System.out.println(p.toString() + "입니다.");

        p.move(100,200,300);
        System.out.println(p.toString() + "입니다.");
    }
}
