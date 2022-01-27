import java.util.*;

class MyThread1 extends TimerTask {
    private String name;

    public MyThread1(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("[" + new Date() + "] " + name + ": BMS College of Engineering");
    }
}

class MyThread2 extends TimerTask {
    private String name;

    public MyThread2(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("[" + new Date() + "] " + name + ": CSE");
    }
}

public class TimerThread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("Thread 1");
        MyThread2 t2 = new MyThread2("Thread 2");
        Timer t = new Timer();
        t.schedule(t1, 1000, 10000); // executes for every 10 seconds
        t.schedule(t2, 1000, 2000); // executes for every 2 seconds
    }
}
