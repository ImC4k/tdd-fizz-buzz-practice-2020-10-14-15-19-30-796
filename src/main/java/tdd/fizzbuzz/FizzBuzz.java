package tdd.fizzbuzz;

public class FizzBuzz {

    public static final int SPECIAL_NUMBER_FOR_FIZZ = 3;
    public static final int SPECIAL_NUMBER_FOR_BUZZ = 5;
    public static final int SPECIAL_NUMBER_FOR_WHIZZ = 7;
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public String countOff(int order) {
        String shoutMessage = "";
        if (order % SPECIAL_NUMBER_FOR_FIZZ == 0) {
            shoutMessage += FIZZ;
        }
        if (order % SPECIAL_NUMBER_FOR_BUZZ == 0) {
            shoutMessage += BUZZ;
        }
        if (order % SPECIAL_NUMBER_FOR_WHIZZ == 0) {
            shoutMessage += WHIZZ;
        }
        return shoutMessage.isEmpty() ? String.valueOf(order) : shoutMessage;
    }
}
