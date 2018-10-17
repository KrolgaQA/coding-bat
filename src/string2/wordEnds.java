package string2;

public class wordEnds {
    public String wordEnds(String str, String word) {
        String s = "";
        for (int i = 0; i <= str.length() - word.length(); i++) {

            if (str.substring(i, i + word.length()).equals(word)) {
                if (i > 0 && i + word.length() < str.length()) {
                    s = s + str.charAt(i - 1) + str.charAt(i + word.length());
                } else if (i > 0) {
                    s = s + str.charAt(i - 1);
                } else if (i + word.length() < str.length()) {
                    s = s + str.charAt(i + word.length());
                }


            }
        }
        return s;
    }
}
