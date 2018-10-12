package string1;

public class NTwise {
    public String nTwice(String str, int n) {
        String s = "";
        if(str.length()>=n){
            s = str.substring(0,n) + str.substring(str.length()-n, str.length());
        }return s;

    }
}
