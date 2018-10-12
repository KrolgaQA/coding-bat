package warmup2;

public class CountXx {
    int countXX(String str) {
        int count = 0;
        if(str.length()>1){
            for(int i=1;i<=str.length()-1;i++){
                if(str.charAt(i)=='x'&str.charAt(i-1)=='x'){
                    count++;
                }
            }
        }return count;

    }
}
