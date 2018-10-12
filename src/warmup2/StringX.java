package warmup2;

public class StringX {
    public String stringX(String str) {
        if(str.length()>1){
            String s = str.substring(1, str.length() - 1);
            s = s.replaceAll("x", "");

            str = str.replaceAll(str.substring(1, str.length()-1), s);
        }


        return str;

    }

}

