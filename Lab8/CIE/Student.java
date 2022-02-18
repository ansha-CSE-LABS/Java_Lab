package CIE;

import java.util.Scanner;

public class Student {
    public String usn;
    public String name;
    public int sem;
    Scanner scan = new Scanner(System.in);

    public void accept() {
        System.out.println("Enter usn:");
        usn = scan.next();
        System.out.println("Enter name:");
        name = scan.next();
        System.out.println("Enter semester:");
        sem = scan.nextInt();
    }

    public void display() {
        System.out.println("Usn:" + usn);
        System.out.println("Name:" + name);
        System.out.println("Semester:" + sem);
    }
}
