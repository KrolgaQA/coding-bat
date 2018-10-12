package warmup1;

public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {

        if((a>0&b<0)|(a<0&b>0)){
            if(negative==true){
                return false;
            }else return true;
        }else if(a<0&b<0){
            if(negative==true){
                return true;
            }else return false;
        }else return false;
    }
}
