package string1;

public class MiddleTwo {
    public String middleTwo(String str) {

        String s = "";

        if(str.length()>=2){
            if(str.length()%2==0) {
                s = str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
            }else s = str.substring((str.length()-1 )/ 2, (str.length()-1 )/ 2+1);
        }return s;

    }

}
