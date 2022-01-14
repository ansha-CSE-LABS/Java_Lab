/*Write a Java program to print the prime numbers between given two integers
(inclusive). Accept these two integers from the user.*/


import java.lang.*;
import java.util.Scanner;

class Prime {

    public static void main(String args[]) {

        int num1, num2;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        num1 = in.nextInt();

        System.out.println("Enter second number");
        num2 = in.nextInt();

        for (int i = num1; i < num2; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (j % 2 == 0) {
                } else {
                    System.out.print(i);
                }
            }
        }
    }
}
