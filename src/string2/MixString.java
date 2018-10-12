package string2;

public class MixString {
    public String mixString(String a, String b) {
        String str = "";
        if (a.length() >= b.length()) {
            for (int i = 0; i < a.length(); i++) {
                str = str + a.charAt(i);
                if (i <= b.length() - 1) {
                    str = str + b.charAt(i);
                }
            }
        } else if (b.length() > a.length()) {
            for (int i = 0; i < a.length(); i++) {
                str = str + a.charAt(i) + b.charAt(i);
            }
            str = str + b.substring(str.length() / 2);
        }
        return str;
    }
}
