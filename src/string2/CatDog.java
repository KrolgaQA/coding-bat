package string2;

public class CatDog {
    public boolean catDog(String str) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                count1++;
            }
        }

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("dog")) {
                count2++;
            }



        }
        if (count1 == count2) {
            return true;
        }
        return false;
    }
}
