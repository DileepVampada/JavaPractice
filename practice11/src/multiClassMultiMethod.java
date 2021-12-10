import java.util.Scanner;

public class multiClassMultiMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		multiClassMultiMethod2 userObj = new multiClassMultiMethod2();
		
		System.out.println("Enter First Value");
		double value1 = userInput.nextDouble();
		
		System.out.println("Enter Second Value");
		double value2 = userInput.nextDouble();
		
		userObj.myMethod(value1, value2);
		userObj.result();
		
	}

}
