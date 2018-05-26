package studentRecords;

import java.util.ArrayList;

public class Course {
    private String title;
    private String code;
    private int number;
    private ArrayList<Student> students;

    public Course() {
        this.title = "Object oriented programming";
        this.code = "ECE";
        this.number = 25100;
        students = new ArrayList<>();
    }

    public Course(String code, int number, String title) {
        this.title = title;
        this.code = code;
        this.number = number;
        students = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return code+number+"-"+title;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void removeStudent(Student student){
        this.students.remove(student);
    }
}
