package string3;

public class NotReplace {
    public String notReplace(String str) {
        String result = "";
        result = str.replaceAll("\\s+?is\\s+?", " is not ");
        result = result.replaceAll("^is\\s+?", "is not ");
        result = result.replaceAll("^is(\\S+?)is$", "is not$1is not");
        result = result.replaceAll("\\s+?is$", " is not");
        result = result.replaceAll("^is$", "is not");

        return result;    }
}
