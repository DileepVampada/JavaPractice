import java.util.Scanner;

public class freeCodePractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter Age:");
		String Age = userInput.next();
		
		int userAge = Integer.parseInt(Age);
		
		if(Age.equals("18")) {
		
		System.out.println("User is eligible");
		}else {
			System.out.println("User is not eligible");
		}
*/
		
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 5) {
				System.out.println("Found value " + arr[i] + " at index " + i);
			}
		}
		
	}
}
