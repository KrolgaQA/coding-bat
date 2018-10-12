package logic1;

public class MaxMod5 {
    public int maxMod5(int a, int b) {
        if(a%5==b%5){
            if(a>b){
                return b;
            }else if(b>a){
                return a;
            }
        }else if(a>b){
            return a;
        }else if(b>a){
            return b;
        }return 0;

    }
}
