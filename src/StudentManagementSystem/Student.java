package StudentManagementSystem;
import java.util.Scanner;

import static java.lang.System.in;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance;
    private static int coursePrice = 700;
    private static int id = 1000;

    public Student() {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter the first name of the student: ");
        this.firstName = scanner.nextLine();
        System.out.println("Enter the last name of the student: ");
        this.lastName = scanner.nextLine();
        System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\n Enter the grade year of the student: ");
        this.gradeYear = scanner.nextInt();

        setStudentID();
        System.out.println("Name: " + firstName + " " + lastName + "\n" + "Grade: " + gradeYear + "\n" + "ID: " + studentID);
    };

    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    };

    public void enroll() {
       do {
           System.out.println("Enter course to enroll (Q to quit): ");
           Scanner in = new Scanner(System.in);
           String course = in.nextLine();
           if (!course.equals("Q")) {
               courses = courses + "\n" + course;
               tuitionBalance = tuitionBalance + coursePrice;
           } else { break; }
       } while ( 1 != 0 );

        System.out.println("Enrolled in: " + courses);
        System.out.println("Tuition balance: " + tuitionBalance);
    };

    // View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // Pay tuition
    public void payTuition() {
        System.out.println("Inform your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Your payment: $" + payment);
        viewBalance();
    }

    // Show status



};

