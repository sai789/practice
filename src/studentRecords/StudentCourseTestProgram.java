package studentRecords;

public class StudentCourseTestProgram {
    public static void main(String[] args) {
        Student s1 = new Student("Tommy Lauren", 100654321, 2016);
        Course c1 = new Course("BIOL", 10100, "Introductory Biology I");
        System.out.println(s1);
        System.out.println(c1);
    }
}
