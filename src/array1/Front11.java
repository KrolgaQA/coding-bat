package array1;

public class Front11 {
    public int[] front11(int[] a, int[] b) {
        int[] c = new int[0];
        if (a.length >= 1 & b.length >= 1) {
            c = new int[2];
            c[0] = a[0];
            c[1] = b[0];
        } else if (a.length == 0 & b.length >= 1) {
            c = new int[1];
            c[0] = b[0];
        } else if (b.length == 0 & a.length >= 1) {
            c = new int[1];
            c[0] = a[0];
        }
        return c;

    }
}
