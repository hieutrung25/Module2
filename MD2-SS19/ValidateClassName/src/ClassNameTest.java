public class ClassNameTest {
    public static String validClassname = "C0308G";
    public static String[] invalidClassname = {"M0318G", "P0323A"};

    public static void main(String[] args) {
        ClassName className = new ClassName();
        System.out.println(className.validate(validClassname));
        for (int i = 0; i < invalidClassname.length; i++) {
            boolean isValid = className.validate(invalidClassname[i]);
            System.out.println(isValid);
        }
    }

}
