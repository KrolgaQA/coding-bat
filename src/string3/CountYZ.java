package string3;

public class CountYZ {
    public int countYZ(String str) {
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='y'|str.charAt(i)=='z'|str.charAt(i)=='Y'|str.charAt(i)=='Z'){
                if(i<=str.length()-2&&!Character.isLetter(str.charAt(i+1))){
                    count++;

                }else if(i==str.length()-1){
                    count++;
                }
            }
        }return count;
    }
}
