import java.util.Scanner;

public class multiClassAndMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		multiClassAndMethod2 objUser = new multiClassAndMethod2();
		
		System.out.println("Enter Name of the User");
		String Name = userInput.nextLine();
		
		objUser.setName(Name);
		objUser.result();
	}

}
