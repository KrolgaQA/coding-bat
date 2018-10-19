package array2;

public class FizzBuzz {
    public String[] fizzBuzz(int start, int end) {
        String[] fizzBuzz = new String[end - start];
        for (int i = 0; i < end - 1; i++) {
            if (start % 3 == 0 & start % 5 == 0) {
                fizzBuzz[i] = "FizzBuzz";

            } else if (start % 3 == 0) {
                fizzBuzz[i] = "Fizz";


            } else if (start % 5 == 0) {
                fizzBuzz[i] = "Buzz";


            } else fizzBuzz[i] = String.valueOf(start);

            start++;
        }
        return fizzBuzz;
    }
}
