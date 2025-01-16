import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int marks1, marks2, marks3;
    int totalMarks;
    double averageMarks;

    // Constructor
    public Student(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        calculateTotalAndAverage();
    }

    // Method to calculate total and average marks
    public void calculateTotalAndAverage() {
        totalMarks = marks1 + marks2 + marks3;
        averageMarks = totalMarks / 3.0;
    }
}

public class Cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // Get student details
        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Marks in Subject 1: ");
            int marks1 = scanner.nextInt();

            System.out.print("Marks in Subject 2: ");
            int marks2 = scanner.nextInt();

            System.out.print("Marks in Subject 3: ");
            int marks3 = scanner.nextInt();

            scanner.nextLine();  // Consume newline

            // Create Student object and add to list
            students.add(new Student(name, marks1, marks2, marks3));
        }

        // Find student with highest and lowest average marks
        Student highestAvgStudent = students.get(0);
        Student lowestAvgStudent = students.get(0);

        for (Student student : students) {
            if (student.averageMarks > highestAvgStudent.averageMarks) {
                highestAvgStudent = student;
            }
            if (student.averageMarks < lowestAvgStudent.averageMarks) {
                lowestAvgStudent = student;
            }
        }

        // Display results
        System.out.println("\n=== Results ===");
        System.out.println("Student with Highest Average Marks: " + highestAvgStudent.name +
                " (Average: " + highestAvgStudent.averageMarks + ")");
        System.out.println("Student with Lowest Average Marks: " + lowestAvgStudent.name +
                " (Average: " + lowestAvgStudent.averageMarks + ")");
    }
}
