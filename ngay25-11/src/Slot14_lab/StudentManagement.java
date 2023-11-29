package Slot14_lab;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class StudentManagement {
    private static final int MAX_STUDENTS = 100;
    private static Student[] students = new Student[MAX_STUDENTS];
    private static int studentCount = 0;
    private static Scanner scanner;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add student");
            System.out.println("2. Edit student by id");
            System.out.println("3. Delete student by id");
            System.out.println("4. Sort student by gpa");
            System.out.println("5. Sort student by name");
            System.out.println("6. Show student");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    editStudent(scanner);
                    break;
                case 3:
                    deleteStudent(scanner);
                    break;
                case 4:
                    sortStudentsByGpa();
                    break;
                case 5:
                    sortStudentsByName();
                    break;
                case 6:
                    showStudents();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 6.");
            }
        } while (choice != 0);
        scanner.close();
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student date of birth: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Enter student address: ");
        String address = scanner.nextLine();

        System.out.print("Enter student GPA: ");
        double gpa = scanner.nextDouble();

        Student student = new Student(id, name, dateOfBirth, address, gpa);
        students[studentCount++] = student;
        System.out.println("Student added successfully.");
    }
    private static int findStudentIndexById(int id) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
    private static void editStudent(Scanner scanner) {
        System.out.print("Enter student ID to edit: ");
        int idToEdit = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        int index = findStudentIndexById(idToEdit);
        if (index != -1) {
            System.out.print("Enter new GPA for student: ");
            double newGpa = scanner.nextDouble();

            students[index].setGpa(newGpa);
            System.out.println("Student information updated successfully.");
        } else {
            System.out.println("Student not found with ID: " + idToEdit);
        }
    }

    private static void deleteStudent(Scanner scanner) {
        System.out.print("Enter student ID to delete: ");
        int idToDelete = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        int index = findStudentIndexById(idToDelete);
        if (index != -1) {
            for (int i = index; i < studentCount - 1; i++) {
                students[i] = students[i + 1];
            }
            studentCount--;
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found with ID: " + idToDelete);
        }
    }

    private static void sortStudentsByGpa() {
        Arrays.sort(students, 0, studentCount, Comparator.comparingDouble(Student::getGpa));
        System.out.println("Students sorted by GPA.");
    }

    private static void sortStudentsByName() {
        Arrays.sort(students, 0, studentCount, Comparator.comparing(Student::getName));
        System.out.println("Students sorted by name.");
    }

    private static void showStudents() {
        if (studentCount == 0) {
            System.out.println("No students to display.");
        } else {
            System.out.println("List of students:");
            for (int i = 0; i < studentCount; i++) {
                System.out.println(students[i].getId() + " - " + students[i].getName() + " - GPA: " + students[i].getGpa());
            }
        }
    }
}
