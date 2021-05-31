import java.io.*;


public class TestOutputStream {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("output2.txt");
        byte[] b1 = new byte[]{'g', 'p', 'c', 'o', 'd', 'e', 'r'};
        byte[] b2 = new byte[]{'.', 'c', 'o', 'm'};
        byte[] b3 = new byte[]{13, 10};
        byte[] b4 = new byte[]{'I', '/', 'O'};
        os.write(b1);
        os.flush();
        os.write(b2);
        os.write(b3);
        os.write(b4);
        os.close();
    }
}
