import java.lang.*;
import java.util.*;

class Quadratic {

    public static void main(String arg[]) {
        int a, b, c;
        double r1, r2, d, real, imag;
        Scanner in = new Scanner(System.in);

        System.out.println("\nFor the Quadratic equation ax^2+bx+c=0, enter a");
        a = in.nextInt();
        System.out.println("Enter b");
        b = in.nextInt();
        System.out.println("Enter c");
        c = in.nextInt();

        d = (b * b) - (4 * a * c);

        if (d == 0) {
            r1 = r2 = -b / 2 * a;
            System.out.println("Roots are equal, r1=r2=" + r2);
        } 
        else if (d > 0) {
            r1 = (-b + Math.sqrt(d)) / 2 * a;
            r2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.println("Roots are" + r1 + "and" + r2);
        } 
        else {
            real = -b / 2 * a;
            imag = Math.sqrt(d) / 2 * a;
            System.out.println("Roots are complex");
        }
    }
}
