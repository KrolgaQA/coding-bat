package string2;

public class StarOut {
    public String starOut(String str) {
        return str.replaceAll("(\\*)+.|.(\\*)+.|.(\\*)|\\*", "");
    }
}
