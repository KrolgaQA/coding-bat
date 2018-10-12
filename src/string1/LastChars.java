package string1;

public class LastChars {
    public String lastChars(String a, String b) {
        String s = "";

        if(a.length()>1){
            if(b.length()>1){
                s =  a.substring(0, 1)+b.substring(b.length()-1, b.length());
            }else if(b.length()==1){
                s =  a.substring(0,1)+b;
            }else s =  a.substring(0,1)+"@";
        } else if(a.length()==1){
            if(b.length()>1){
                s =  a+b.substring(b.length()-1, b.length());
            }else if(b.length()==1){
                s =  a+b;
            }else s =  a+"@";
        } else if(a.length()==0){
            if(b.length()>1){
                s =  "@"+b.substring(b.length()-1, b.length());
            }else if(b.length()==1){
                s =  "@"+b;
            }else s =  "@"+"@";
        }
        return s;
    }
}
