package warmup1;

public class BackAround {
    public String backAround(String str){
        String s = str.substring(str.length()-2);
        return s+str+s;
    }
}
