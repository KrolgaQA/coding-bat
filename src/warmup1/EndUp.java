package warmup1;

public class EndUp {
    public String endUp(String str) {
        if(str.length()>=3){
        String s1 = str.substring(str.length()-3, str.length()).toUpperCase();
            System.out.println(s1);
        str = str.replace(str.substring(str.length()-3, str.length()), "");
            System.out.println(str);
        return str+s1;}
        else return str.toUpperCase();
    }
}
