/* Develop a Java program to create a class Bank that maintains two kinds of account for
its customers, one called savings account and the other current account. The
savings account provides compound interest and withdrawal facilities but no
cheque book facility. The current account provides cheque book facility but
no interest. Current account holders should also maintain a minimum balance
and if the balance falls below this level, a service charge is imposed.

Create a class
Account that stores customer name, account number and type of account. From
this derive the classes Curr-acct and Sav-acct to make them more specific to
their requirements. Include the necessary methods in order to achieve the
following tasks:
a)      Accept
deposit from customer and update the balance.
b)      Display
the balance.
c)      Compute
and deposit interest
d)     Permit
withdrawal and update the balance
Check for the minimum balance, impose
penalty if necessary and update the balance.*/

import java.util.*;
import java.lang.Math;

class Account {
    String name;
    int acc_num;
    double bal;

    // Account(String name, int acc_num, double bal) {
    // this.name = name;
    // this.acc_num = acc_num;
    // this.bal = bal;
    // }

    void accept() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of account holder: ");
        name = scan.nextLine();
        System.out.println("Enter account number: ");
        acc_num = scan.nextInt();
        System.out.println("Enter account balcnce: ");
        bal = scan.nextFloat();
    }

    void display() {
        System.out.println("\nDetails:");
        System.out.println("Name:" + name + "\nAccount number:" + acc_num + "\nBalance:" + bal);
    }

    void deposit() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to deposit? 1.yes\t2.no");
        int d = scan.nextInt();
        if (d == 1) {
            System.out.println("Enter the amount to be deposited: ");
            double amt = scan.nextDouble();
            bal = bal + amt;
            System.out.println("Available balnce: " + bal);
        } else {
            return;
        }
    }

    void withdrawal() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to withdraw? 1.yes\t2.no");
        int d = scan.nextInt();
        if (d == 1) {
            System.out.println("Enter the amount to be withdrawn");
            double amount = scan.nextDouble();
            if (amount > bal) {
                System.out.println("Insufficient balance");
            } else {
                bal = bal - amount;
                System.out.println(amount + " withdrwan");
                System.out.println("Available balance= " + bal);
            }
        } else {
            return;
        }
    }
}

class Current extends Account {
    double service_charge = 100;

    // Current(String name, int acc_num, double bal) {
    // super(name, acc_num, bal);
    // }
    void cheque() {
        System.out.println("Cheque service is available");
    }

    void checkbal(Current c) {
        if (c.bal < 1000) {
            c.bal = c.bal - service_charge;
            System.out.println("Service charges charged for less than minimum balance");
            System.out.println("Available balance = " + bal);
        }
    }
}

class Savings extends Account {

    // Savings(String name, int acc_num, double bal) {
    // super(name, acc_num, bal);
    // }
    void cheque() {
        System.out.println("\nNo cheque service");
        System.out.println("No minimum balance required");
    }

    void simple_interest() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter rate of interest: ");
        int r = scan.nextInt();
        System.out.println("Enter the number of times interest applied per time period");
        int n = scan.nextInt();
        System.out.println("Enter the time elapse: ");
        int t = scan.nextInt();
        double si = bal * (1 + r / n);
        System.out.println("Simple intrest =Rs " + (Math.pow(si, n * t)));
        // scan.close();
    }
}

class NewBank {
    public static void main(String args[]) {
        System.out.println("1.Savings");
        System.out.println("2.Current");
        System.out.println("Enter your choice: ");
        Scanner scan = new Scanner(System.in);
        int ch = scan.nextInt();

        switch (ch) {
            case 1:
                Savings obj1 = new Savings();
                obj1.accept();
                obj1.display();
                obj1.cheque();
                obj1.deposit();
                obj1.withdrawal();
                obj1.simple_interest();
                break;
            case 2:
                Current obj2 = new Current();
                obj2.accept();
                obj2.display();
                obj2.cheque();
                obj2.deposit();
                obj2.withdrawal();
                obj2.checkbal(obj2);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
