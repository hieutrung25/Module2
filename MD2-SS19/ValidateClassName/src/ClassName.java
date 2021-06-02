import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    public final String CLASS_REGEX = "^[CAP][\\d]{4}[GHIKLMN]$";

    public ClassName() {
    }

    public boolean validate(String className) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(className);
        boolean isvalid = matcher.matches();
        return isvalid;
    }
}
