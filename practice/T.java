/*
class Mythread1 extends Thread{
	@Override
	public void run(){
		int i=0;
		while(i<20){
		System.out.println("[USN]");
		i++;
		}
	}
}
class Mythread2 extends Thread{
	@Override
	public void run(){
		int i=0;
		while(i<20){
		System.out.println("[CSE]");
		i++;
		}
	}
}
class Mythread3 extends Thread{
	@Override
	public void run(){
		int i=0;
		while(i<20){
		System.out.println("[BMSCE]");
		i++;
		}
	}
}

public class T{
	public static void main(String[] args){
		Mythread1 t1 = new Mythread1();
		Mythread2 t2 = new Mythread2();
		Mythread3 t3 = new Mythread3();
		t1.start();
		t2.start();
		t3.start();
	}
}
*/

/*
class Mythread1 implements Runnable{
	@Override
	public void run(){
		int i=0;
		while(i<20){
		System.out.println("[USN]");
		i++;
		}
	}
}
class Mythread2 implements Runnable{
	@Override
	public void run(){
		int i=0;
		while(i<20){
		System.out.println("[CSE]");
		i++;
		}
	}
}
class Mythread3 implements Runnable{
	@Override
	public void run(){
		int i=0;
		while(i<20){
		System.out.println("[BMSCE]");
		i++;
		}
	}
}
public class T{
	public static void main(String[] args){
		Mythread1 t1 = new Mythread1();
		Mythread2 t2 = new Mythread2();
		Mythread3 t3 = new Mythread3();
		Thread t4 = new Thread(t1);
		Thread t5 = new Thread(t2);
		Thread t6 = new Thread(t3);
		t4.start();
		t5.start();
		t6.start();
	}
}
*/

import java.util.*;
class Mythread1 extends TimerTask{
	@Override
	public void run(){
		System.out.println("[USN]");
	}
}
class Mythread2 extends TimerTask{
	@Override
	public void run(){
		System.out.println("[CSE]");
	}
}

class Mythread3 extends TimerTask{
	@Override
	public void run(){
		System.out.println("[BMSCE]");
	}
}
public class T{
	public static void main(String[] args){
		Mythread1 t1 = new Mythread1();
		Mythread2 t2 = new Mythread2();
		Mythread3 t3 = new Mythread3();
		Timer t = new Timer();
		t.schedule(t1,1000,1000);
		t.schedule(t2,1000,1001);
		t.schedule(t3,1000,1002);
	}
}	


