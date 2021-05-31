package demodata;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DataOutputStreamExample {
    public static void main(String[] args) throws IOException {
        int id = 1;
        String name = "gpcoder.com";
        OutputStream file = new FileOutputStream("data/test3.txt");
        DataOutputStream dout = new DataOutputStream(file);
        dout.writeInt(id);
        dout.writeUTF(name);
        dout.flush();
        dout.close();
        System.out.println("Success...");
    }
}
