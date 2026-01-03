import java.util.ArrayList;
import java.util.Iterator;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

   
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully.");
    }

  
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

  
    public Student searchStudent(int rollNo) {
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                return s;
            }
        }
        return null;
    }

  
    public boolean deleteStudent(int rollNo) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            if (it.next().getRollNo() == rollNo) {
                it.remove();
                return true;
            }
        }
        return false;
    }
}
