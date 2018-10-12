package logic2;

public class RoundSum {

    public int roundSum(int a, int b, int c) {
        return round(a) + round(b) + round(c);
    }


    public int round(int n) {
        if (n % 10 >= 5) {
            return n + 10 - n % 10;
        } else if (n % 10 < 5) {
            return n - n % 10;
        }return n;

    }

}
