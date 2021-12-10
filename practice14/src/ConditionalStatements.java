import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please Enter age");
		int age = userInput.nextInt();
		
		System.out.println(age >=18 ? "TRUE" : "FALSE");
		
	}

}
