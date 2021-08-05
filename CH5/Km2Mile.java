package CH5;
import java.util.Scanner;

public class Km2Mile extends Converter{
    private double km;
    Km2Mile(double km){ this.km = km; }
    @Override
    protected String getSrcString(){ return "Km";}
    protected String getDestString(){ return "mile";}
    protected double convert(double src){ return src/km; }
    public static void main(String[] args) {
        Km2Mile toMile = new Km2Mile(1.6); //1마일은 1.6Km
        toMile.run();
    }
}
