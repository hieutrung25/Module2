import java.io.*;

public class CopyFile {
    public static void copyFile(String sourcePath, String targetPath) {
        try {
            File sourceFile = new File(sourcePath);
            File targetFile = new File(targetPath);
            if (!sourceFile.exists()) {
                throw new FileNotFoundException();
            }
            FileInputStream inputFile = new FileInputStream(sourceFile);
            FileOutputStream outputFile = new FileOutputStream(targetFile);
            byte[] bt = new byte[1024];
            int length;

            while ((length = inputFile.read(bt)) > 0)
                outputFile.write(bt, 0, length);

        } catch (IOException e) {
            System.err.println("Not exist File");
        }
    }

    public static int countChar(String pathname) throws IOException {
        File file = new File(pathname);
        FileInputStream inputFile = new FileInputStream(file);
        int count = 0;
        while (inputFile.read() != -1)
            count++;
        return count;
    }
}
