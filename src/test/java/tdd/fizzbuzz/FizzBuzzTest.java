package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_string_of_number_when_count_off_given_non_special_number() {
        // given
        int order = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String actual = fizzBuzz.countOff(order);

        // then
        assertEquals(String.valueOf(order), actual);
    }
}
