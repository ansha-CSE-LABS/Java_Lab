import java.lang.*;
import java.util.Scanner;

class Userinput {
    public static void main(String arg[]) {
        int a;
        float b;
        String s;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter integer");
        a = in.nextInt();
        System.out.println("You entered integer " + a);

        System.out.println("Enter a float");
        b = in.nextFloat();
        System.out.println("You entered float " + b);
        
        System.out.println("Enter a string");
        in.nextLine();
        s = in.nextLine();
        System.out.println("You entered string " + s);
    }
}
