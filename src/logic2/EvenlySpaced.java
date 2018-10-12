package logic2;

public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        if (c <= a & a <= b) {
            if (countSpase(c, a) == countSpase(a, b)) {
                return true;
            }
        } else if (b <= c & c <= a) {
            if (countSpase(b, c) == countSpase(c, a)) {
                return true;
            }
        } else if (a <= b & b <= c) {
            if (countSpase(a, b) == countSpase(b, c)) {
                return true;
            }
        } else if (c <= b & b <= a) {
            if (countSpase(c, b) == countSpase(b, a)) {
                return true;
            }
        } else if (a <= c & c <= b) {
            if (countSpase(a, c) == countSpase(c, b)) {
                return true;
            }
        } else if (b <= a & a <= c) {
            if (countSpase(b, a) == countSpase(a, c)) {
                return true;
            }
        }
        return false;

    }

    public int countSpase(int a, int b) {
        return Math.abs(a - b);
    }

}
