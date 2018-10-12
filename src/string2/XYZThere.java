package string2;

public class XYZThere {
    public boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 3; i++) {
            if (i != 0) {
                if (str.substring(i, i + 3).equals("xyz")&str.charAt(i-1)!='.') {
                    return true;
                }
            }else if(str.substring(i, i+3).equals("xyz")){
                return true;
            }
        }return false;
    }
}
