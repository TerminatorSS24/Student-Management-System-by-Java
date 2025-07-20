import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n==== Student Management System ====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Edit Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    Student s = new Student(id, name, age, course);
                    manager.addStudent(s);
                    System.out.println("Student added.");
                    break;

                case "2":
                    manager.viewStudents();
                    break;

                case "3":
                    System.out.print("Enter Student ID to edit: ");
                    String editId = sc.nextLine();
                    manager.editStudent(editId, sc);
                    break;

                case "4":
                    System.out.print("Enter Student ID to delete: ");
                    String delId = sc.nextLine();
                    manager.deleteStudent(delId);
                    break;

                case "5":
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
