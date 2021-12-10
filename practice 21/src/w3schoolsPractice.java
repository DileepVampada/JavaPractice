import java.util.Scanner;

public class w3schoolsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter first Value ");
		double value1 = userInput.nextDouble();
		
		System.out.println("Enter Second Value");
		double value2 = userInput.nextDouble();
		
/*		System.out.println("Enter Third Value");
		double value3 = userInput.nextDouble();
		
		System.out.println("Enter Fourth Value");
		double value4 = userInput.nextDouble();
	
		double area = Math.PI * Math.pow(value1, 2);
		double perimeter = 2 * Math.PI * value1;
*/		
		System.out.println("Values before swapping:" + value1 + " " + value2);
/*		double temp = value1;
		value1 = value2;
		value2 = temp;
*/
		value1 = value1 + value2;
		value2 = value1 - value2;
		value1 = value1 - value2;
		System.out.println("Values before swapping:" + value1 + " " + value2);
	}

}
