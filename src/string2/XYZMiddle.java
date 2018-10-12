package string2;

public class XYZMiddle {
    public boolean xyzMiddle(String str) {
        if (str.contains("xyz")) {
            if (str.length() % 2 == 0) {
                if (str.substring(str.length() / 2, str.length() / 2 + 1).equals("z")
                        & str.substring(str.length() / 2 - 2, str.length() / 2).equals("xy")) {
                    return true;
                } else if (str.substring(str.length() / 2 - 1, str.length() / 2).equals("x")
                        & str.substring(str.length() / 2, str.length() / 2 + 2).equals("yz")) {
                    return true;
                }
            } else if (str.length() % 2 != 0) {
                if (str.substring((str.length() - 1) / 2 - 1, (str.length() - 1) / 2).equals("x")
                        & str.substring((str.length() - 1) / 2, (str.length() - 1) / 2 + 2).equals("yz")) {
                    return true;
                }
            }
        }
        return false;
    }
}
