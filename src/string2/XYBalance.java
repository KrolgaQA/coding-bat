package string2;

public class XYBalance {
    public boolean xyBalance(String str) {
        if (str.lastIndexOf("y") >= str.lastIndexOf("x")) {
            return true;
        }
        return false;
    }
}
