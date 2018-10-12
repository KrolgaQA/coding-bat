package logic1;

public class RedTicket {
    public int redTicket(int a, int b, int c) {
        if (a == b & b == c & a == c) {
            if (a == 2) {
                return 10;
            } else return 5;
        } else if (b != a & c != a) {
            return 1;
        }
        return 0;


    }
}
