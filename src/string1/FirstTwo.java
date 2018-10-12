package string1;

public class FirstTwo {
    public String firstTwo(String str){
        String s = "";
        if(str.length()>=2){
            s = s+str.substring(0, 2);
        }else s = str;
        return s;
    }
}
