import java.util.Scanner;

public class multiclassWithParamters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		multiclass2WithParameters multiclassObject = new multiclass2WithParameters();
		
		System.out.println("Please Enter userName");
		String userName = userInput.nextLine();
		
		multiclassObject.mymulticlassMethod(userName);
	}

}
