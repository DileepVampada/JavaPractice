
public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userInput[] = {10, 11, 12, 13, 14, 15};
		int total = 0;
		
		//Enhance for loop && int - Data type; i - Identifier; userInput - Array
		
		for(int i : userInput) { 				
			total += i;
		}
		System.out.println("Total Value is:" + total);
	}

}
