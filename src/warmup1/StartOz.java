package warmup1;

public class StartOz {
    public String startOz(String str) {
        if(str.length()==0){
            return "";
        }else if(str.length()==1){
            if(str.substring(0,1).equals("o")){
                return str.substring(0,1);
            }else return "";
        }else if(str.length()>=2){
            if(str.substring(0,2).equals("oz")){
                return str.substring(0,2);
            }else if(str.substring(0,1).equals("o") ){
                return str.substring(0, 1);
            }else if(str.substring(1,2).equals("z")) {
                return str.substring(1, 2);
            }else return "";
        }else return "";

    }
}
