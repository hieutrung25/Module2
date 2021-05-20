package Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @org.junit.jupiter.api.Test
    void fizzBuzzTranslate3() {
        int number = 3;
        String expected = "Fizz";
        String actual = FizzBuzz.FizzBuzzTranslate(number);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void fizzBuzzTranslate5() {
        int number = 5;
        String expected = "Buzz";
        String actual = FizzBuzz.FizzBuzzTranslate(number);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void fizzBuzzTranslate15() {
        int number = 15;
        String expected = "FizzBuzz";
        String actual = FizzBuzz.FizzBuzzTranslate(number);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void fizzBuzzTranslate1() {
        int number = 1;
        String expected = "1";
        String actual = FizzBuzz.FizzBuzzTranslate(number);
        assertEquals(expected, actual);
    }

}