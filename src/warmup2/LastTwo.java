package warmup2;

public class LastTwo {
    public int last2(String str) {
        int count = 0;
        if(str.length()>=2){
            String s = str.substring(str.length()-2,str.length());
            for (int i=0; i<str.length()-2;i++){
                if (str.substring(i, i+2).equals(s)){
                    count++;
                }

            }
        }return count;

    }
}
