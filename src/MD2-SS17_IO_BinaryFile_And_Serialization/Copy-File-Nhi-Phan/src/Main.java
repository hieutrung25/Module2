import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWrite raw = new ReadAndWrite();
        try {
            List<Byte> list = raw.readFile("file.txt");
            raw.writeFile("copy.txt", list);
            System.out.println("So byte trong file la: " + list.size());
        } catch (IOException e) {
            System.err.println("File khong ton tai hoac bi loi");
        }
    }
}
