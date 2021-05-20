package Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzUpLevelTest {

    @Test
    void fizzBuzzTranslate13() {
        int number = 13;
        String expected = "Fizz";
        String actual = FizzBuzzUpLevel.FizzBuzzTranslate(number);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzzTranslate25() {
        int number = 25;
        String expected = "Buzz";
        String actual = FizzBuzzUpLevel.FizzBuzzTranslate(number);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzzTranslate1() {
        int number = 1;
        String expected = "mot";
        String actual = FizzBuzzUpLevel.FizzBuzzTranslate(number);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzzTranslate11() {
        int number = 11;
        String expected = "muoi mot";
        String actual = FizzBuzzUpLevel.FizzBuzzTranslate(number);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzzTranslate20() {
        int number = 20;
        String expected = "hai muoi";
        String actual = FizzBuzzUpLevel.FizzBuzzTranslate(number);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzzTranslate21() {
        int number = 21;
        String expected = "hai muoi mot";
        String actual = FizzBuzzUpLevel.FizzBuzzTranslate(number);
        assertEquals(expected, actual);
    }
}