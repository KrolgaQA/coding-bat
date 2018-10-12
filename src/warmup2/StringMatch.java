package warmup2;

public class StringMatch {
    public int stringMatch(String a, String b) {
        char [] a1 = a.toCharArray();
        char [] b1= b.toCharArray();
        int count = 0;

        for(int i=0,j=0; i<a1.length-1&j<b.length()-1;i++, j++){
                if (b1[j] == a1[i] & b1[j + 1] == a1[i+1]) {
                    count++;
                }
        }return count;


    }
}
