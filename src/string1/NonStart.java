package string1;

public class NonStart {
    public String nonStart(String a, String b) {
        String a1 = "";
        String b1 = "";
        if(a.length()>1){
            a1 = a.substring(1, a.length());
        }

        if(b.length()>1){
            b1 = b.substring(1, b.length());
        }

        return a1+b1;

    }
}
