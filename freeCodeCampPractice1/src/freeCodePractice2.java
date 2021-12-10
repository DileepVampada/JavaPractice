import java.util.Scanner;

public class freeCodePractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = new String[3];
		
		Scanner userInput = new Scanner(System.in);
		
		int count = 1;
		for (int i = 0; i < names.length; i++) {
			System.out.print(" Enter UserName" + count + ":");
			String userName = userInput.next();
			names[i] = userName;
			count++;
		}
		for(String element: names) {
			System.out.println(" UserName:" + element);
		}
	}

}
