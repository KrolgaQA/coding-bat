package logic2;

public class LoneSum {
    public int loneSum(int a, int b, int c) {
        if (a != b & a != c & b != c) {
            return a + b + c;
        } else if (a == b & a != c) {
            return c;
        } else if (a == c & c != b) {
            return b;
        } else if (b == c & a != b) {
            return a;
        }
        return 0;
    }
}
