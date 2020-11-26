package tdd.fizzbuzz;

public class FizzBuzz {

    public static final int SPECIAL_NUMBER_FOR_FIZZ = 3;
    public static final int SPECIAL_NUMBER_FOR_BUZZ = 5;
    public static final int SPECIAL_NUMBER_FOR_WHIZZ = 7;

    public String countOff(int order) {
        String shoutMessage = "";
        if (order % SPECIAL_NUMBER_FOR_FIZZ == 0) {
            shoutMessage += "Fizz";
        }
        if (order % SPECIAL_NUMBER_FOR_BUZZ == 0) {
            shoutMessage += "Buzz";
        }
        if (order % SPECIAL_NUMBER_FOR_WHIZZ == 0) {
            shoutMessage += "Whizz";
        }
        return shoutMessage.isEmpty()? String.valueOf(order) : shoutMessage;
    }
}
