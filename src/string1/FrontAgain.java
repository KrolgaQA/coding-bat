package string1;

public class FrontAgain {
    public boolean frontAgain(String str) {
        if(str.length()>=2){
            if(str.charAt(0)==str.charAt(str.length()-2)&str.charAt(1)==str.charAt(str.length()-1)){
                return true;
            }
        }return false;

    }
}
