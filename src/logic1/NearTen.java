package logic1;

public class NearTen {
    public boolean nearTen(int num) {

        int ex = num % 10;
        if (ex >= 0 & ex <= 2) {
            return true;
        } else if (Math.abs(ex - 9) <= 0 & Math.abs(ex - 9) >= -2) {
            return true;
        } else if (Math.abs(ex - 8) <= 0 & Math.abs(ex - 8) >= -2) {
            return true;
        }
        return false;
    }
}
