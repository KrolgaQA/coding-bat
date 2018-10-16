package string3;

public class GHappy {
    public boolean gHappy(String str) {
        for(int i=0; i<str.length(); ++i) {
            if(!isCharcterHappy(str,i))
                return false;
        }
        return true;
    }

    boolean isCharcterHappy(String s, int index) {
        if(s.charAt(index)!='g')
            return true;
        if(index>0 && s.charAt(index-1)=='g')
            return true;
        if(index<s.length()-1 && s.charAt(index+1)=='g')
            return true;
        return false;
    }
}
