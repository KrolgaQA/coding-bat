package string1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String s = "";
        if(str.length()>=2){
            for(int i = 0;i<=2;i++){
                s = s+str.substring(str.length()-2, str.length());
            }
        }return s;

    }

}
