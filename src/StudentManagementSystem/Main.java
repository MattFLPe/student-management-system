package StudentManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number of new students:");
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        Student[] students = new Student[numberOfStudents];

        for (int n = 0; n < numberOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }
    }
}