package logic1;

public class GreenTicket {
    public int greenTicket(int a, int b, int c) {
        if (a == b & a == c) {
            return 20;
        } else if (a == b | b == c | a == c) {
            return 10;
        } else return 0;
    }
}
