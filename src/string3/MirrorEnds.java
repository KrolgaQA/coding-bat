package string3;

public class MirrorEnds {
    public String mirrorEnds(String string) {
        String result = "";

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - i - 1))
                result += Character.toString(string.charAt(i));
            else
                break;
        }
        return result;
    }
}
