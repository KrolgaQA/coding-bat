package warmup1;

public class MixStart {
    public boolean mixStart(String str){
        if(str.length()>=3) {
            if (str.substring(1, 3).equals("ix")) {
                return true;
            } else return false;
        }else return false;
    }
}
