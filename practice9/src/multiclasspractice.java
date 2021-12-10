import java.util.Scanner;

public class multiclasspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		multiclassPractice2 userObj	= new multiclassPractice2();
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please input1");
		double input1 = userInput.nextInt();
		
		System.out.println("Please input2");
		double input2 = userInput.nextInt();
		
		userObj.myMethod(input1, input2);
	}

}
