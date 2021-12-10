import java.util.Scanner;

public class MultiClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the age of puppy");
		int Age = userInput.nextInt();
		
		MultiClass2 userObj = new MultiClass2("Tommy");
		
		userObj.setAge(Age);
		userObj.Result();
	}

}
