package string2;

public class EndOther {
    public boolean endOther(String a, String b) {
        if(b.toUpperCase().endsWith(a.toUpperCase())||a.toUpperCase().endsWith(b.toUpperCase())){
            return true;
        }else return false;
    }
}
