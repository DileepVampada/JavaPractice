import java.util.Scanner;
public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		//int x=0;
		double income, total=0;
		
		System.out.print("Enter number of days:");
		int days = userInput.nextInt();
		
		for (int x = 1; x <= days; x++) {
			System.out.print("Enter income of day" + x +":");
			income = userInput.nextInt();
			total= total + income;
		}
		
		/*while (x < days ) {
			x++;
			System.out.print("Enter income of day" + x +": \n");
			income = userInput.nextInt();
			total = total + income;
		}
		*/
		double Avg = total / days;
		System.out.println("Total:" + total);
		System.out.println("Avg Income:" + Avg);
		
	}

}
