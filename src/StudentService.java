import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found");
            return;
        }

        for (Student s : students) {
            System.out.println(
                "ID: " + s.getId() +
                " | Name: " + s.getName() +
                " | Marks: " + s.getMarks() +
                " | Grade: " + s.getGrade()
            );
        }
    }

    public void updateStudent(int id, String name, double marks) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(name);
                s.setMarks(marks);
                System.out.println("Student updated!");
                return;
            }
        }
        System.out.println("Student not found");
    }

    public void deleteStudent(int id) {
        boolean removed = students.removeIf(s -> s.getId() == id);
        if (removed) {
            System.out.println("Student deleted!");
        } else {
            System.out.println("Student not found");
        }
    }
}
