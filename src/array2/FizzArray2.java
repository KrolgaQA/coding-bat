package array2;

public class FizzArray2 {
    public String[] fizzArray2(int n) {
        String[] s = new String[n];
        if (n > 0) {
            for (int i = 0; i < s.length; i++) {
                s[i] = String.valueOf(i);
            }
        }
        return s;
    }
}
