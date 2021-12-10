import java.util.Scanner;

public class practice4 {
	
	public static void main(String args[]) {
		
		int Marks;
		String Grade = null ;
		
		Scanner input4 = new Scanner(System.in);
		
		System.out.println("Enter Marks");
		Marks = input4.nextInt();
		
			if(Marks < 0 || Marks > 100){
				
			System.out.println("Invalid Marks enetered");
			
			}
		
			switch(Marks/10) {
		
			case 6:
				Grade = "D";
				System.out.println("Congratulations! You have passed With Grade:" + Grade);
				break;
		
			case 7:
				Grade = "C";
				System.out.println("Congratulations! You have passed With Grade:" + Grade);
				break;
			
			case 8:
				Grade = "B";
				System.out.println("Congratulations! You have passed With Grade:" + Grade);
				break;
			
			case 9:
				Grade = "A";
				System.out.println("Hurrah! You have passed with distinction" + Grade);
				break;
			
			default:
				System.out.println("Student Failed. Appear for re-exam");
			}
			
	}

}
