import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public void writeFile(String path, List<Byte> bytes) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        DataOutputStream dos = new DataOutputStream(fos);
        for (Byte byt: bytes) {
            dos.write(byt);
        }
        dos.close();
        fos.close();
    }
    public List<Byte> readFile(String path) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        DataInputStream dis = new DataInputStream(fis);
        List<Byte> list = new ArrayList<>();
        int value;
        while ((value = dis.read())!=-1){
            list.add((byte) value);
        }
        dis.close();
        fis.close();
        return list;
    }
}
