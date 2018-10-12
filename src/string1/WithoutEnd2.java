package string1;

public class WithoutEnd2 {
    public String withouEnd2(String str) {
        String s = "";
        if(str.length()>=2) {
            s = str.substring(1, str.length() - 1);
        }return s;


    }

}
