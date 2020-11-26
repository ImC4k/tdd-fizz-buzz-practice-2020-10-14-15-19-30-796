package tdd.fizzbuzz;

public class FizzBuzz {

    public static final int SPECIAL_NUMBER_FOR_FIZZ = 3;
    public static final int SPECIAL_NUMBER_FOR_BUZZ = 5;

    public String countOff(int order) {
        if (order % SPECIAL_NUMBER_FOR_FIZZ == 0) {
            return "Fizz";
        }
        else if (order % SPECIAL_NUMBER_FOR_BUZZ == 0) {
            return "Buzz";
        }
        else if (order % 7 == 0) {
            return "Whizz";
        }
        return String.valueOf(order);
    }
}
