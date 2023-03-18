
import java.util.Scanner;

public class Student_main {
    public static void main(String[] args) {
        Student_class obj_student = new Student_class();
        Scanner obj_Scanner = new Scanner(System.in);
        obj_student.setName("Ankit Savani");
        obj_student.setContact("9624645952");
        obj_student.setEmail("ankitmavani12345@gmail.com");
        obj_student.setCity("Surat");

        System.out.println(obj_student.getName());
    }
}
