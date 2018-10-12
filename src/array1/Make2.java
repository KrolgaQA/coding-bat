package array1;

public class Make2 {
    public int[] make2(int[] a, int[] b) {
        int[] c = new int[2];
        if (a.length == 0) {
            if (b.length != 0) {
                for (int i = 0; i <= b.length - 1 & i <= c.length - 1; i++) {
                    c[i] = b[i];
                }
            }
        } else if (b.length == 0) {
            if (a.length != 0) {
                for (int i = 0; i <= a.length - 1 & i <= c.length - 1; i++) {
                    c[i] = a[i];
                }
            }
        } else if (b.length!=0) {
            if (a.length >= 2) {
                c[0] = a[0];
                c[1] = a[1];
            } else {
                c[0] = a[0];
                c[1] = b[0];
            }
        }
        return c;
    }
}
