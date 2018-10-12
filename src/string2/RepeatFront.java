package string2;

public class RepeatFront {
    public String repeatFront(String str, int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + str.substring(0, n - i);
        }
        return s;
    }
}
