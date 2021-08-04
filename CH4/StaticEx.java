package CH4;

class ArrayUtil{
    public static int[] concat(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
            c[i] = a[i];
        for(int j=0;j<b.length;j++)
            c[a.length+j] = b[j];
        return c;
    }
    public static void print(int[] a){
        System.out.print("[ ");
        for(int k=0;k<a.length;k++)
            System.out.print(a[k]+" ");
        System.out.println("]");
    }
}

public class StaticEx {
    public static void main(String[] args) {
        int[] array1 = {1,5,7,9};
        int[] array2 = {3,6,-1,100,77};
        int[] array3 = ArrayUtil.concat(array1,array2);
        ArrayUtil.print(array3);
    }
}
