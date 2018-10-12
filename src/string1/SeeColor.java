package string1;

public class SeeColor {
    public String seeColor(String str) {
        if (str.length() >= "red".length()) {
            if (str.lastIndexOf("red") == 0) {
                return "red";
            } else if (str.length() >= "blue".length()) {
                if (str.lastIndexOf("blue") == 0) {
                    return "blue";
                }
            }
        }
        return "";
    }
}
