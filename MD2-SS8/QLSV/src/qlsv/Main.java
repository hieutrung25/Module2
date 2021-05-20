package qlsv;

public class Main {
    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        manageStudent.add(new Student(111, "Cường đô la",29));
        manageStudent.add(new Student(1211, "Sơn đô la",22));
        manageStudent.add(new Student(1211, "Sơn đô la",23));
        manageStudent.add(new Student(1211, "Sơn đô la",25));
        manageStudent.add(new Student(1211, "Sơn đô la",20));
        manageStudent.display();
        manageStudent.edit("Cường đô la", new Student(22,"Chương CC",95));
        manageStudent.display();

    }
}
