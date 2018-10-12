package logic1;

public class In1To10 {
    public boolean in1To10(int n, boolean outsideMode) {
        if ((n >= 1 & n <= 10) & !outsideMode || n <= 1 & outsideMode || n >= 10 & outsideMode) {
            return true;
        } else if ((n >= 1 & n <= 10) & outsideMode) {
            return false;
        }
        return false;
    }
}
