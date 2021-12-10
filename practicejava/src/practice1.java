import java.util.Scanner;

public class practice1 {
	
	public static void main(String args[]) {
		
		Scanner practice = new Scanner(System.in);
		
//		double result = practice.nextDouble();
//		System.out.print(result);
		
		double a, b, c;
		
		System.out.println("Enter Number:");
		a = practice.nextDouble();
		
		System.out.println("Enter Number:");
		b = practice.nextDouble();
		
		c = a - b;
		System.out.println("Result" + c);
	}
	
}
