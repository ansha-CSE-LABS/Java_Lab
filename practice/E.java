import java.util.*;

class NotPossible extends Exception{
	@Override
	public String toString(){
		return "not possible";
	}
}

class Company{
	int year;
	Company(int year){
		this.year=year;
	}
	public void checkYear() throws NotPossible{
		if(year<2005){
			throw new NotPossible();
		}
	}
}
class Employee extends Company{
	int age;
	Employee(int year, int age){
		super(year);
		this.age=age;
	}
	void checkAge() throws NotPossible{
		if(18<age && age<60){
			throw new NotPossible();
		}
	}
}
public class E{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year of joining:");
		int y = sc.nextInt();
		System.out.println("Enter age:");
		int a = sc.nextInt();
		Employee e = new Employee(y,a);
		try{
			e.checkYear();
			System.out.println("Success1");
		}
		catch(NotPossible x){
			System.out.println(" Year <2005 :"+ x);
		}
		try{
			e.checkAge();;
			System.out.println("Success2");
		}
		catch(NotPossible x){
			System.out.println("Age error");
		}

	}
}