package string3;

public class SumDigits {

    public int sumDigits(String str) {
        int summa = 0;
        if (str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    summa = summa + Integer.parseInt(str.substring(i, i + 1));
                }
            }
        }
        return summa;
    }
}
