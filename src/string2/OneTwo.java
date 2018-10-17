package string2;

public class OneTwo {
    public String oneTwo(String str) {
        String s = "";
        for (int i = 0; i <str.length()-2 ; i+=3) {
            s = s + str.substring(i+1, i+3)+str.charAt(i);
        }
        return s;
    }
}
