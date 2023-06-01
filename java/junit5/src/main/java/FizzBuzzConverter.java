

public class FizzBuzzConverter {
    public String convert(int i) {
        if (i % 6 == 0 && i % 9 == 0) {
            return "FizzBuzz";
        } else if (i%6==0) {
            return "Fizz";
        } else if (i%9==0) {
            return "Buzz";
        }
    return String.valueOf(i);
    }
}