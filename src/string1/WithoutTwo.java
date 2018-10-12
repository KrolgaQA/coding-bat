package string1;

public class WithoutTwo {
    public String without2(String str) {
        if(str.length()>=2){
            if(str.charAt(0)==str.charAt(str.length()-2)&str.charAt(1)==str.charAt(str.length()-1)){
                str = str.replaceFirst(str.substring(str.length()-2, str.length()), "");
            }
        }return str;

    }
}
