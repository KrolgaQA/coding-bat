package warmup2;

public class StringSplosion {
    public String stringSplosion(String str) {
        String s = "";
        if(str.length()>0){
        for(int i=0; i<=str.length(); i++) {
            s = s + str.substring(0, i);
        }
        }return s;

    }
}
