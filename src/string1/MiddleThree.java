package string1;

public class MiddleThree {
    public String middleThree(String str) {
        if(str.length()>=3){
            return str.substring((str.length()-1)/2-1, (str.length()-1)/2+2);
        }return "";

    }
}
