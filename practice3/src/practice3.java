import java.util.Scanner;

public class practice3 {
	
	public static void main(String args[]) {
		
		int Maths, English, Physics;
		
		Scanner input3 =new Scanner(System.in);
	
		System.out.println("Enter Maths marks");
		Maths = input3.nextInt();
		
		System.out.println("Enter English marks");
		English = input3.nextInt();
		
		System.out.println("Enter Physics marks");
		Physics = input3.nextInt();
		
		if(Maths > 35 && English > 35 && Physics >35) {
			System.out.println("Congratulations!! Student Pass in all subjects. Promoted to next Grade");
		}else {
			System.out.println("Sorry Student Failed. Apprear to re-exam again");
		}
	}
}
