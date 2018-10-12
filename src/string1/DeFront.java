package string1;

public class DeFront {
    public String deFront(String str) {
        if (str.length() > 0) {
            if (str.length() == 1 & str.equals("a")) {
                return str;
            } else if (str.length() > 1) {
                if (str.charAt(0) == 'a' & str.charAt(1) == 'b') {
                    return str;
                } else if (str.charAt(0) == 'a' & str.charAt(1) != 'b') {
                    String s ="" + str.charAt(1);
                    str = str.replaceFirst(s, "");
                    return str;
                } else if (str.charAt(0) != 'a' & str.charAt(1)=='b'){
                    String s ="" + str.charAt(0);
                    str = str.replaceFirst(s, "");
                    return str;
                } else return str.substring(2);
            }
        }
        return "";
    }
}
