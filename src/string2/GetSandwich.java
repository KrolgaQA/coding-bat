package string2;

public class GetSandwich {
    public String getSandwich(String str) {
        String s = "";
        int a = 0;
        int count = 0;
        for (int i = 0; i < str.length() - 4; i++) {
            if (str.substring(i, i + 5).equals("bread")) {
                count++;
                if (count == 1) {
                    a = i;
                }
            }

        }
        if (count >= 2) {
            s = str.substring(a + 5, str.lastIndexOf("bread"));
        }
        return s;
    }
}
