package string1;

public class WithoutX2 {
    public String withoutX2(String str) {
        char[] s = str.toCharArray();
        for (int i = 0; i<=s.length-1&i <= 1; i++) {
            if (s[i] == 'x') {
str = str.replaceFirst("x", "");            }

        }

        return str;

    }
}
