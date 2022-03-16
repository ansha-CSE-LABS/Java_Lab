import java.util.*;

class WrongAge extends Exception {
    public String toString() {
        return " Son's age can not be greater than or equal to father's age\n";
    }
}

class Father {
    int fatherAge;

    Father(int fatherAge) {
        this.fatherAge = fatherAge;
    }
}

class Son extends Father {
    int sonAge;

    Son(int fatherAge, int sonAge) {
        super(fatherAge);
        this.sonAge = sonAge;
    }

    void checkAge() throws WrongAge {
        if (fatherAge <= sonAge) {
            throw new WrongAge();
        }
    }
}

public class Exception1 {
    public static void main(String[] args)
    {
        Son s1 = new Son (50,15);
        Son s2 = new Son (40,40);
        try{
            s1.checkAge();
            System.out.println("Acceptable ages");
        }
        catch(WrongAge a){
            System.out.println("Caught exception:"+a);
        }
        try{
            s2.checkAge();
            System.out.println("Acceptable ages");
        }
        catch(WrongAge a){
            System.out.println("Caught exception:"+a);
        }
    }
}
