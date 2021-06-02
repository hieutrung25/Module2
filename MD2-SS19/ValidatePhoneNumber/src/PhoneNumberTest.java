public class PhoneNumberTest {
    public static String validPhone = "(84)-(0978489481)";
    public static String invalidPhone = "(a8)-(22222222)";

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        System.out.println(phoneNumber.validate(validPhone));
        System.out.println(phoneNumber.validate(invalidPhone));
    }
}
