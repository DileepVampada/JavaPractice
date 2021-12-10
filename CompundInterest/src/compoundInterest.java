import java.util.Scanner;

public class compoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A = P(1+R)^n
		// Simple Interest = PTR/100
		
		Scanner userInput = new Scanner(System.in);
		
		double sAmount = 0, cAmount = 0;
		
		System.out.print("Enter Principal Amount: ");
		double principal = userInput.nextDouble();
		
		System.out.print("Enter Rate of Interest %: ");
		double rate = userInput.nextDouble()/100;
		
		System.out.print("Enter total No. of Months: ");
		int totalMonths = userInput.nextInt();
		
		double interest = principal * rate * totalMonths;
		System.out.println("Total Interest Amount: " + interest);
		
		sAmount = principal + interest;
		
		System.out.println("Total Amount: " + sAmount);
		
		for (int month = 1; month <= totalMonths; month++) {
			cAmount = principal*Math.pow(1+rate, month);
			
//			System.out.println(month + " " + cAmount);
		
		if(month >= totalMonths){
			System.out.println("Total Compound Interest Amount is: " + cAmount);
		}
		}
		System.out.println("Difference Amount is: " + (cAmount-sAmount));
	}

}
