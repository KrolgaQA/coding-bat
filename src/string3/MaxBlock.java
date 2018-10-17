package string3;

public class MaxBlock {
    public int maxBlock(String str) {
        int count = 0;
        int tmpCount = 0;
        for (int i = 0; i <str.length()-1; i++) {
            if(str.charAt(i)==str.charAt(i+1)){
                tmpCount++;
            }else if(tmpCount>=count){
                count = tmpCount;
                tmpCount = 0;
            }
        }
        return count;
    }
}
