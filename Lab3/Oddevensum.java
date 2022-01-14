/*Accept an array of size n from the user. Find the sum of even indices (i.e., 0,2,4....)
and sum of odd indices (1,3,5....) and print the same*/

import java.lang.*;
import java.util.*;

class Oddevensum {
    public static void main(String arg[]) {

        Scanner in = new Scanner(System.in);
        int even = 0, odd = 0;
        int arr[];
        arr = new int[10];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                even += arr[i];
            else
                odd += arr[i];
        }
        System.out.println("Sum of even elements=" + even);
        System.out.println("Sum of odd elements=" + odd);
    }
}
