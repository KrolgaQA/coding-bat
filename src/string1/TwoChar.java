package string1;

public class TwoChar {
    public String twoChar(String str, int index) {
        String s = "";
        if(index<str.length()-1&index>0){
            s = s+str.substring(index, index+2);

        }else s = str.substring(0,2);
        return s;

    }
}
