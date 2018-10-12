package warmup1;

public class Close10 {
    public int close10(int a, int b){
        if(Math.abs(10-Math.abs(a))>Math.abs(10-Math.abs(b))){
            return Math.abs(b);
        }else if(Math.abs(10-Math.abs(a))<Math.abs(10-Math.abs(b))){
            return Math.abs(a);
        }else return 0;
    }
}
