package string1;

public class RightTwo {
    public String right2(String str) {
        String s = "";
        if(str.length()>=2){
            s = str.substring(str.length()-2,str.length())+ str.substring(0, str.length()-2);
        }else s = str;
        return s;

    }
}
