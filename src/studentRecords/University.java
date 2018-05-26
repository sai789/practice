package studentRecords;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Course> courses;
    private ArrayList<Student> students;

    public University(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void offerCourse(Course course){
        this.courses.add(course);
    }

    public void cancelCourse(Course course){
        if (course.getStudents() != null){
            courses.remove(course);
        }
    }

    public void enrollStudentInCourse(Student student, Course course){
        if (courses.contains(course)){
            course.addStudent(student);
            student.addCourse(course);
        }
    }

    public void withdrawStudentFromCourse(Student student, Course course){
        if (students.contains(student)){
            student.removeCourse(course);
            course.removeStudent(student);
        }
    }

    @Override
    public String toString() {
        return name+": "+courses.size()+" Courses, "+students.size()+" Students";
    }
}
