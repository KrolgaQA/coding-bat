package logic2;

public class CloseFar {
    public boolean closeFar(int a, int b, int c) {
        if ((close(a, b) & far(a, c) & far(b, c)) | ((close(a, c) & far(a, b) & far(b, c)))) {
            return true;
        }
        return false;
    }

    public boolean close(int x, int y) {
        if (Math.abs(x - y) <= 1) {
            return true;
        }
        return false;
    }

    public boolean far(int x, int y) {
        if (Math.abs(x - y) >= 2) {
            return true;
        }
        return false;
    }
}
