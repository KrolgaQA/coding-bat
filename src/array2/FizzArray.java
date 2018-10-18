package array2;

public class FizzArray {
    public int[] fizzArray(int n) {
        int[] s = new int[n];
        if(s.length>0){
            for (int i = 0; i <s.length ; i++) {
                s[i] = i;
            }
        }return s;
    }
}
