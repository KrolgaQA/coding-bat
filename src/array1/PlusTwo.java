package array1;

public class PlusTwo {
    public int[] plusTwo(int[] a, int[] b) {
        int aLen = a.length;
        int bLen = b.length;
        int [] c= new int [aLen+bLen];
//        System.arraycopy(a, 0, c, 0, aLen);
//        System.arraycopy(b, 0, c, aLen, bLen);
//        return c;

        for(int i=0;i<=c.length/2-1;i++){
            c[i] = a[i];
            c[i+2] = b[i];
        }return c;

    }
}
