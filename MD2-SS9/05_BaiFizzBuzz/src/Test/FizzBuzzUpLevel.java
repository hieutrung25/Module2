package Test;
import static java.lang.Integer.parseInt;

public class FizzBuzzUpLevel {
    public static String FizzBuzzTranslate(int number) {
        if (number > 100) {
            throw new RuntimeException("Out of limit");
        } else {
            String result;
            String numberString = String.valueOf(number);
            if (numberString.contains("3"))
                return result = "Fizz";
            else if (numberString.contains("5"))
                return result = "Buzz";
            else if (number <= 10)
                return readSingleNumber(number);
            else if (number % 10 == 0)
                return readMultipleOfTen(number);
            else if (number > 10 && number < 20)
                return reading10to20Number(number);
            else
                return readOtherNumber(number);
        }
    }

    public static String readSingleNumber(int number) {
        switch (number) {
            case 1:
                return "mot";
            case 2:
                return "hai";
            case 4:
                return "bon";
            case 6:
                return "sau";
            case 7:
                return "bay";
            case 8:
                return "tam";
            case 9:
                return "chin";
            case 10:
                return "muoi";
            case 0:
                return "khong";
            default:
                return null;
        }
    }

    public static String reading10to20Number(int number) {
        int secondDigit = number % 10;
        String result = "muoi " + readSingleNumber(secondDigit);
        return result;
    }

    public static String readMultipleOfTen(int number) {
        int firstDigit = number / 10;
        String result = readSingleNumber(firstDigit) + " muoi";
        return result;
    }

    public static String readOtherNumber(int number) {
        int firstDigit = parseInt(String.valueOf(number / 10));
        int secondDigit = number % 10;
        String result = readSingleNumber(firstDigit);
        result += " muoi " + readSingleNumber(secondDigit);
        return result;
    }
}