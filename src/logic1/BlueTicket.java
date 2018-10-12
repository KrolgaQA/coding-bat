package logic1;

public class BlueTicket {
    public int blueTicket(int a, int b, int c) {
        int sum1 = a + b;
        int sum2 = b + c;
        int sum3 = a + c;

        if (sum1 == 10 || sum2 == 10 || sum3 == 10) {
            return 10;
        } else if (Math.abs(sum1 - sum2) >= 10 || Math.abs(sum2 - sum3) >= 10 || Math.abs(sum1 - sum3) >= 10) {
            return 5;
        }
        return 0;

    }
}
