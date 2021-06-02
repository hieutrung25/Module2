import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public final String PHONE_REGEX = "^\\([\\d]{2}\\)\\-\\([0][\\d]{9}\\)$";
    public PhoneNumber(){
    }
    public boolean validate(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean isValid = matcher.matches();
        return isValid;
    }
}
