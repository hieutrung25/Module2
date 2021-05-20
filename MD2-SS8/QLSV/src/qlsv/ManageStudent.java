package qlsv;

import java.util.ArrayList;

public class ManageStudent {
    ArrayList<Student> students;
    public ManageStudent(){
        this.students = new ArrayList<>();
    }
    public void add(Student student){
        students.add(student);
    }
    public void display(){
        for (int i=0; i<students.size();i++){
            System.out.println(students.get(i));
        }
        System.out.println("---------------");
    }
    public int findByName(String name){
        for (int i=0; i<students.size();i++){
            if (students.get(i).getName().equals(name)){
                return 1;
            }
        }
        return -1;
    }
    public void edit(String name, Student student){
        int indexOfStudent = findByName(name);
        if (indexOfStudent == -1){
            System.out.println("Không có:))");
        } else {
            student.set(indexOfStudent, student)
        }
    }
}
