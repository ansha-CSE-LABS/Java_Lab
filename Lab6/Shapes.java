/*Develop a Java
program to create an abstract class named Shape that contains two integers
and an empty method named printArea( ). Provide three classes named
Rectangle, Triangle and Circle such that each one of the classes extends the
class Shape. Each one of the classes contain only the method printArea( )
that prints the area of the given shape.*/

import java.util.*;

abstract class Shape {
	int length, breadth, radius;

	Scanner input = new Scanner(System.in);

	abstract void printArea();

}

class Rectangle extends Shape {
	void printArea() {
		System.out.println("* Finding the Area of Rectangle *");
		System.out.print("Enter length and breadth: ");
		length = input.nextInt();
		breadth = input.nextInt();
		System.out.println("The area of Rectangle is: " + length * breadth);
	}
}

class Triangle extends Shape {
	void printArea() {
		System.out.println("\n* Finding the Area of Triangle *");
		System.out.print("Enter Base And Height: ");
		length = input.nextInt();
		breadth = input.nextInt();
		System.out.println("The area of Triangle is: " + (length * breadth) / 2);
	}
}

class Circle extends Shape {
	void printArea() {
		System.out.println("\n* Finding the Area of Cricle *");
		System.out.print("Enter Radius: ");
		radius = input.nextInt();
		System.out.println("The area of Cricle is: " + 3.14f * radius * radius);
	}
}

public class Shapes {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.printArea();

		Triangle tri = new Triangle();
		tri.printArea();

		Circle cir = new Circle();
		cir.printArea();
	}
}
