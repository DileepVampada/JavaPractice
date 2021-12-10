import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while loop
		
		int input = 0;
		
		Scanner input6 = new Scanner(System.in);
		
		System.out.print("Enter input to repeat the message: ");
		int message = input6.nextInt();
		
		while(input < message) {
			input++;
			System.out.println(input + " Hello");
		}
		
	}

}
