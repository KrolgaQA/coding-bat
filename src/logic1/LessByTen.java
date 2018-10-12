package logic1;

public class LessByTen {
    public boolean lessBy10(int a, int b, int c) {
        int d1 = Math.abs(a - b);
        int d2 = Math.abs(a - c);
        int d3 = Math.abs(b - c);
        if (d1 >= 10 || d2 >= 10 || d3 >= 10) {
            return true;
        }
        return false;


    }
}
