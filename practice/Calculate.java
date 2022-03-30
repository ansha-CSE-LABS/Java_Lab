import calculator.*;
import java.util.*;

public class Calculate{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out .println("Enter two number:");
		int n1= scan.nextInt();
		int n2= scan.nextInt();
		Sum s = new Sum(n1, n2);
		Diff d = new Diff(n1, n2);
		s.sum();
		d.diff();
	}
}