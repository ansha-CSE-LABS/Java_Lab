/*
Create a class Book which contains four members: name, author, price,
num_pages. Include a constructor to set the values for the members. Include
methods to set and get the details of the objects. Include a toString( ) method that
could display the complete details of the book. Develop a Java program to create
n book objects.
*/

import java.util.*;

class MyBook {

    private String name;
    private String author;
    private double price;
    private double num_pages;

    Scanner in = new Scanner(System.in);

    public MyBook() {
        this.name = "";
        this.author = "";
        this.price = 0;
        this.num_pages = 0;
    }

    public String toString() {
        String temp = "Book name: " + name + "\nAuthor:" + author + "\nPrice:" + price + "\nNumber of pages:"
                + num_pages;
        return temp;
    }

    public void set() {
        System.out.println("\nEnter Book details:");
        System.out.println("Name: ");
        name = in.nextLine();
        System.out.println("Author: ");
        author = in.nextLine();
        System.out.println("Price of book: ");
        price = in.nextDouble();
        System.out.println("Number of pages: ");
        num_pages = in.nextDouble();
    }
}

public class Book {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of books :");
        n = sc.nextInt();
        MyBook b[] = new MyBook[n];

        for (int i = 0; i < n; i++) {
            b[i] = new MyBook();
            b[i].set();
        }

        System.out.println("\nDetails of all the books:\n");
        for (int j = 0; j < n; j++) {
            System.out.println(b[j] + "\n");
        }
    }
}
