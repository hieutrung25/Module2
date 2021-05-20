package qlsv;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int tuoi;

    public Student(int id, String name, int tuoi) {
        this.id = id;
        this.name = name;
        this.tuoi = tuoi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
    public int compareTo(Student o){
        return this.getTuoi() - o.getTuoi();
    }
}
