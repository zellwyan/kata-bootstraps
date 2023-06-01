

public class FizzBuzzConverter {
    public String convert(int i, int input) {
        boolean isMultipleOf6 = input % 6 == 0;
        boolean isMultipleOf9 = input % 9 == 0;

        if (isMultipleOf6 && isMultipleOf9) {
            return "FizzBuzz";
        } else if (isMultipleOf6) {
            return "Fizz";
        } else if (isMultipleOf9) {
            return "Buzz";
        }
        
    return String.valueOf(i);
    }
}