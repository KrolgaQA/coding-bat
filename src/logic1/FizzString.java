package logic1;

public class FizzString {
    public String fizzString(String str) {
        if (str.startsWith("f")) {
            if (str.endsWith("b")) {
                return "FizzBuzz";
            } else return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        }
        return str;
    }
}
