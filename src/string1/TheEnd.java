package string1;

public class TheEnd {
    public String theEnd(String str, boolean front) {
        String s = "";
        if(str.length()>=2){
            if(front==true){
                s = s+str.charAt(0);
            }else s = s+str.charAt(str.length()-1);
        }else s = str;
        return s;

    }
}
