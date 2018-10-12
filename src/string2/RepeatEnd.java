package string2;

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + str.substring(str.length() - n);
        }
        return s;
    }
}
