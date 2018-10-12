package warmup1;

public class EveryNth {
    public String everyNth(String str, int n){
        String s = str.substring(0,1);
        for (int i=n;i<=str.length()-1;i++){
            if(i%n==0) {
                s = s+str.substring(i, i+1);
            }
        }return s;
    }
}
