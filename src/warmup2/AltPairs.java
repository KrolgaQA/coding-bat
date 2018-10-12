package warmup2;

public class AltPairs {
    public String altPairs(String str) {
        if(str.length()>=10){
            return str.substring(0,2)+str.substring(4,6)+str.substring(8,10);
        }else if(str.length()>=6){
            return str.substring(0,2)+str.substring(4,6);
        }else if(str.length()>=2){
            return str.substring(0,2);
        }else return "";

    }
}
