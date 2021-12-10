import java.util.Scanner;

public class practice2 {
	
	public static void main (String args[]) {
		int salary;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Salary Details");
		salary = input.nextInt();
		
		if(salary > 20000) {
			System.out.println("Accept Job");
		}else
			System.out.println("Reject");
	}
}
