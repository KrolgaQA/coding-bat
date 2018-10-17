package string3;

public class SumNumbers {
    public int sumNumbers(String str) {
        int sum = 0;
        String s = "0";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                s = s + str.charAt(i);
            } else {
                sum = sum + Integer.parseInt(s);
                s = "0";
            }
        }
        sum += Integer.parseInt(s);
        return sum;
    }
}
