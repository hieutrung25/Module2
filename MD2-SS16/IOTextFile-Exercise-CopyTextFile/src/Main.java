import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Insert source path");
        Scanner sc = new Scanner(System.in);
        String sourceStr = sc.nextLine();

        System.out.println("Insert target path");
        String targetStr = sc.nextLine();

        CopyFile.copyFile(sourceStr, targetStr);
        System.out.println("Number of character in source file is " + CopyFile.countChar(sourceStr));
    }
}
