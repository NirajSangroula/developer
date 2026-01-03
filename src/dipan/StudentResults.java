// File: `src/dipan/StudentResults.java`
package dipan;

import java.util.Scanner;

public class StudentResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID (int): ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume endline

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of subjects (int): ");
        int numSubjects = scanner.nextInt();

        Student student = new Student(id, name, numSubjects);

        for (int i = 0; i < numSubjects; i++) { // requirement: use for loop
            System.out.print("Enter mark for subject " + (i + 1) + " (int): ");
            int mark = scanner.nextInt();
            student.addMark(mark);
        }

        System.out.println("\nStudent Details:");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());

        int total = student.getTotal();
        double average = student.getAverage();
        String grade = student.getGrade();
        String result = student.isPass() ? "Pass" : "Fail";

        System.out.println("Total Marks: " + total);
        System.out.printf("Average Marks: %.2f%n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);

        scanner.close();
    }
}