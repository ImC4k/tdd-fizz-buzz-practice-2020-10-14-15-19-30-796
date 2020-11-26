package tdd.fizzbuzz;

public class FizzBuzz {

    public static final int SPECIAL_NUMBER_FOR_FIZZ = 3;

    public String countOff(int order) {
        if (order % SPECIAL_NUMBER_FOR_FIZZ == 0) {
            return "Fizz";
        }
        else if (order % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(order);
    }
}
