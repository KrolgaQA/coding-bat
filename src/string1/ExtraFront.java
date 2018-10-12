package string1;

public class ExtraFront {
    public String extraFront(String str) {
        String s = "";
        if(str.length()>=2){
            for (int i=0; i<3; i++){
                s = s + str.charAt(0)+str.charAt(1);
            }
        }else {
            for(int i = 0; i<3; i++){
                s = s+str;
            }
        }return s;

    }

}
