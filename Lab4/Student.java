/*Develop a Java program to create a class Student with members usn, name, an array
credits and an array marks. Include methods to accept and display details and a method to
calculate SGPA of a student.*/

import java.util.*;

class Details {

    private String usn;
    private String name;
    private int credits[];
    private int totalc = 0;
    private int marks[];
    private double sgpa = 0;
    private int n;

    Scanner in = new Scanner(System.in);

    public void accept() {
        System.out.println("\nEnter Student name:");
        name = in.nextLine();
        System.out.println("Enter USN:");
        usn = in.nextLine();
        System.out.println("Enter number of subjects:");
        n = in.nextInt();

        credits = new int[n];
        marks = new int[n];
        System.out.println("Enter details of the subjects:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter the credits for subject" + (i + 1));
            credits[i] = in.nextInt();
            totalc += credits[i];
            System.out.println("Enter the marks for subject" + (i + 1));
            marks[i] = in.nextInt();
        }
    }

    public void display() {
        System.out.println("\nStudent USN:" + usn);
        System.out.println("Student Name:" + name);
        System.out.printf("SGPA: %.2f\n\n", sgpa);
    }

    public void calculate() {
        double sum = 0;
        double grade[] = new double[n];

        for (int i = 0; i < n; i++) {
            grade[i] = (marks[i] / 10) * credits[i];
        }
        for (int i = 0; i < n; i++) {
            sum += grade[i];
        }
        sgpa = sum / totalc;
    }
}

public class Student {
    public static void main(String[] args) {

        Details s1 = new Details();
        s1.accept();
        s1.calculate();
        s1.display();
    }
}
