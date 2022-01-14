/*Wriite a C/Java program to accept the CIE marks (Out of 50) and SEE marks (Out of
100) of a student and print his/her grade. Use if… elseif ladder*/

import java.lang.*;
import java.util.Scanner;

class Marks {

    public static void main(String arg[]) {

        int cie, see, marks;
        char grade;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter CIE marks out of 50");
        cie = in.nextInt();

        System.out.println("Enter SEE marks out of 100");
        see = in.nextInt();

        see = see / 2;
        marks = cie + see;

        if (marks >= 90) {
            System.out.println("Grade is S");
        } else if (marks >= 80) {
            System.out.println("Grade is A");
        } else if (marks >= 70) {
            System.out.println("Grade is B");
        } else if (marks >= 60) {
            System.out.println("Grade is C");
        } else if (marks >= 50) {
            System.out.println("Grade is D");
        } else {
            System.out.println("Fail");
        }
    }
}
