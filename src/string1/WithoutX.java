package string1;

public class WithoutX {
    public String withoutX(String str) {
        if (str.length()>=2){
        if (str.charAt(0)=='x'){
            String s = ""+str.charAt(0);
            str = str.replaceFirst(s, "");

        }

        if (str.charAt(str.length()-1)=='x') {
            return str.substring(0, str.length() - 1);
        }
        }else return "";
        return str;

    }
}
