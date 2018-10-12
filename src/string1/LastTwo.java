package string1;

public class LastTwo {
    public String lastTwo(String str) {
        String s1 = "";
        if(str.length()>=2){
            char[] s = str.toCharArray();
            char index1 = s[str.length()-2];
            char index2 = s[str.length()-1];
            s[str.length()-2] = index2;
            s[str.length()-1] = index1;
            for (char index: s) {
                s1 = s1+index;

            }str = s1;

        }
        return str;

    }
}
