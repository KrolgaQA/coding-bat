package string1;

public class HasBad {
    public boolean hasBad(String str) {


        int index = str.indexOf("bad");

        if (index==0|index==1){
            return true;

        }return false;

    }
}
