import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Marks;
		String Grade = null;
		
		Scanner input5 = new Scanner(System.in);
		
		System.out.println("Enter your total Marks");
		Marks = input5.nextDouble();
		
		if(Marks < 0 || Marks >100) {
			System.out.println("Please enter valid Marks");
		}else if(Marks >= 0 && Marks < 35) {
			Grade = "F";
			System.out.println("Failed in exam. Please attend re-exam");
		}else if (Marks >= 35 && Marks <= 60) {
			Grade = "D";
			System.out.println("Your Grade:" + Grade);
		}else if (Marks > 60 && Marks <= 70) {
			Grade = "C";
			System.out.println("Your Grade:" + Grade);
		}else if (Marks > 70 && Marks <= 80) {
			Grade = "B";
			System.out.println("Your Grade:" + Grade);
		}else if (Marks > 80 && Marks <= 100) {
			Grade = "A";
			System.out.println("Your Grade:" + Grade);
		}
	}

}
