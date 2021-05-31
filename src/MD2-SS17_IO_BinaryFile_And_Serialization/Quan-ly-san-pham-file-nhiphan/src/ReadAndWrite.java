import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public void writeFile(String pathFile, List<Product> list) throws IOException {
        FileOutputStream output = new FileOutputStream(pathFile);
        ObjectOutputStream oos = new ObjectOutputStream(output);
        oos.writeObject(list);
        oos.close();
        output.close();
    }

    public List<Product> readFile(String pathFile) throws Exception {
        List<Product> list = new ArrayList<>();
        FileInputStream input = new FileInputStream(pathFile);
        ObjectInputStream ois = new ObjectInputStream(input);
        list = (List<Product>) ois.readObject();
        ois.close();
        input.close();
        return list;
    }
}
