package warmup2;

public class DoubleX {
    boolean doubleX(String str) {
        if (str.length() >= 2) {
            int s = str.indexOf('x');
            if ((str.length() - 1 > s) & (str.charAt(s + 1) == 'x')) {
                return true;
            } else return false;

        }
        return false;
    }
}
