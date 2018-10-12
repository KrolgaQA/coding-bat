package warmup1;

public class DelDel {
    public String delDel(String str){
        String s = "del";
        if(str.length()>3) {
            if (str.substring(1, 4).equals("del")) {
                return str.replaceAll(s, "");
            } else return str;
        }else return str;
    }
}
