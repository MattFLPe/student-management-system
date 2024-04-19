package StudentManagementSystem;
import java.util.Scanner;

import static java.lang.System.in;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int coursePrice = 700;

    public Student() {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter the first name of the student: ");
        this.firstName = scanner.nextLine();
        System.out.println("Enter the last name of the student: ");
        this.lastName = scanner.nextLine();
        System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\n Enter the grade year of the student: ");
        this.gradeYear = scanner.nextInt();
        System.out.println(firstName + " " + lastName + " " + gradeYear);
    }
}
