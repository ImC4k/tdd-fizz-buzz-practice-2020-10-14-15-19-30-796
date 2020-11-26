package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void should_return_string_of_number_when_count_off_given_non_special_number() {
        // given
        int order = 1;

        // when
        String actual = fizzBuzz.countOff(order);

        // then
        assertEquals(String.valueOf(order), actual);
    }

    @Test
    void should_return_Fizz_when_count_off_given_multiple_of_special_number_for_fizz() {
        // given
        int order = 3;

        // when
        String actual = fizzBuzz.countOff(order);

        // then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_Buzz_when_count_off_given_multiple_of_special_number_for_buzz() {
        // given
        int order = 5;

        // when
        String actual = fizzBuzz.countOff(order);

        // then
        assertEquals("Buzz", actual);
    }

    @Test
    void should_return_Whizz_when_count_off_given_multiple_of_special_number_for_whizz() {
        // given
        int order = 7;

        // when
        String actual = fizzBuzz.countOff(order);

        // then
        assertEquals("Whizz", actual);
    }

    @Test
    void should_return_FizzBuzz_when_count_off_given_multiple_of_special_number_for_fizz_and_buzz() {
        // given
        int order = 15;

        // when
        String actual = fizzBuzz.countOff(order);

        // then
        assertEquals("FizzBuzz", actual);
    }
}
