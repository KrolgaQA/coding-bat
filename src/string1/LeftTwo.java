package string1;

public class LeftTwo {
    public String left2(String str) {
        String s = "";
        if(str.length()>=2){
            s = str.substring(2, str.length())+str.substring(0,2);
        }else s = str;
        return s;

    }
}
