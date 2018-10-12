package string2;

public class PrefixAgain {
    public boolean prefixAgain(String str, int n) {
        if (str.substring(1).contains(str.substring(0, n))) {
            return true;
        }
        return false;
    }
}
