import Test.FizzBuzzUpLevel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insert a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String output = FizzBuzzUpLevel.FizzBuzzTranslate(number);
        System.out.println(output);
    }
}