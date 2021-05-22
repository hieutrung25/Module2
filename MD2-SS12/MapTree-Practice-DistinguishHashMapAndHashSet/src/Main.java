import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Sơn", 22, "HN");
        Student student2 = new Student("Tanh", 28, "HN");
        Student student3 = new Student("Tiến", 28, "HN");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();

        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);
        System.out.println("====Print HashMap with foreach and toString ====");
        for (Map.Entry<Integer, Student> student: studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("====Print HashMap directly ====");
        System.out.println(studentMap);

        System.out.println("====Print HashSet with foreach and toString ====");
        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student1);

        for (Student student : studentSet) {
            System.out.println(student.toString());
        }
        System.out.println("====Print hashSet directly ====");
        System.out.println(studentSet);
    }

}
