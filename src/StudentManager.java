import java.io.*;
import java.util.*;

public class StudentManager {
    private static final String FILE_NAME = "students.txt";

    public List<Student> loadStudents() {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                Student s = Student.fromString(line);
                if (s != null)
                    students.add(s);
            }
        } catch (IOException e) {
        }
        return students;
    }

    public void saveStudents(List<Student> students) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Student s : students) {
                bw.write(s.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving students: " + e.getMessage());
        }
    }

    public void addStudent(Student s) {
        List<Student> students = loadStudents();
        students.add(s);
        saveStudents(students);
    }

    public void viewStudents() {
        List<Student> students = loadStudents();
        System.out.println("\n--- Student List ---");
        for (Student s : students) {
            System.out.printf("ID: %s | Name: %s | Age: %d | Course: %s\n",
                    s.getId(), s.getName(), s.getAge(), s.getCourse());
        }
        if (students.isEmpty())
            System.out.println("No students found.");
    }

    public void editStudent(String id, Scanner sc) {
        List<Student> students = loadStudents();
        boolean found = false;
        for (Student s : students) {
            if (s.getId().equals(id)) {
                found = true;
                System.out.print("New name: ");
                s.setName(sc.nextLine());
                System.out.print("New age: ");
                s.setAge(Integer.parseInt(sc.nextLine()));
                System.out.print("New course: ");
                s.setCourse(sc.nextLine());
                break;
            }
        }
        if (found) {
            saveStudents(students);
            System.out.println("Student updated.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(String id) {
        List<Student> students = loadStudents();
        boolean removed = students.removeIf(s -> s.getId().equals(id));
        if (removed) {
            saveStudents(students);
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
