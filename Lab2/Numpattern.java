/*Write a C/Java program to accept a number n from the user and print n rows of output
as given below if n=4.
1
2 3
4 5 6
7 8 9 10 */
    
import java.lang.*;

class Numpattern {

    static void Pattern(int n) {
        int num = 1;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" " + num);
                num = num + 1;
            }
            System.out.println("\n");
        }
    }

    public static void main(String arg[]) {
        int n = 4;
        Pattern(n);
    }
}
