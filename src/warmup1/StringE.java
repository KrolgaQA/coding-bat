package warmup1;

public class StringE {
    public boolean stringE(String str) {
        int col = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='e'){
                col++;
            }
        }
        if(col<=3&col>0){
            return true;
        }else return false;
    }
}
