/*Write a program to demonstrate
generics with multiple object parameters.*/

import java.util.*;

class MyGeneric<T1, T2> {
    int num;
    private T1 n1;
    private T2 n2;

    public MyGeneric(int num, T1 n1, T2 n2) {
        this.num = num;
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getnum() {
        return num;
    }

    public void setnum(int num) {
        this.num = num;
    }

    public T1 getT1() {
        return n1;
    }

    public void setT1(T1 n1) {
        this.n1 = n1;
    }

    public T2 getT2() {
        return n2;
    }

    public void setT2(T2 n2) {
        this.n2 = n2;
    }

}

public class Generics {
    public static void main(String[] args) {

        MyGeneric<String, Integer> g1 = new MyGeneric(23, "This is a string", 45);
        Integer int1 = g1.getnum();
        String str1 = g1.getT1();
        Integer int2 = g1.getT2();
        System.out.println("\n" + int1 + "\n" + str1 + "\n" + int2);
    }
}
