package demodata;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataInputStreamEx {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("data/test3.txt");
        DataInputStream input = new DataInputStream(inputStream);

        int id = input.readInt();
        String name = input.readUTF();

        System.out.println("Id: " + id + ", name: " + name);
        input.close();
    }
}
