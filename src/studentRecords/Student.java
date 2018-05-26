package studentRecords;

import java.util.ArrayList;

public class Student {
    private String name;
    private int year;
    private int studentNumber;
    private ArrayList<Course> courses;
    public Student(){
        this.name = "Ram";
        this.year = 2000;
        this.studentNumber = 1234567890;
        courses = new ArrayList<>();
    }

    public Student(String name, int studentNumber, int year){
        this.name = name;
        this.year = year;
        this.studentNumber = studentNumber;
        courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course){
        this.courses.add(course);
    }

    public void removeCourse(Course course){
        this.courses.remove(course);
    }

    @Override
    public String toString() {
        return name+" #"+studentNumber+" ("+year+")";
    }
}
