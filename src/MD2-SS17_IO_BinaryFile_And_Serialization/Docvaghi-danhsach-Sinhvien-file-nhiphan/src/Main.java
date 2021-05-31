import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn Trung Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Hoàng Anh", "Hà Nội"));
        students.add(new Student(3, "Nguyễn Xuân Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Trung", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật Anh", "Hà Nội"));
        writeToFile("students.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("students.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }

    static void writeToFile(String path, List<Student> lists) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lists);
            oos.close();
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static List<Student> readDataFromFile(String path) {
        List<Student> list = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (List<Student>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
