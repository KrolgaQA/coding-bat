package string1;

public class StartWord {
    public String startWord(String str, String word) {
        if(str.length()>=word.length()){
            if (word.substring(1).equals(str.substring(1, word.length()))){
                return str.substring(0, word.length());
            }
        }

        return "";

    }
}
