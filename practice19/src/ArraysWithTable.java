
public class ArraysWithTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		System.out.println("Index\tValue");
		
		int userInput[] = {10, 11, 12, 13, 14, 15};
		
		for(int i = 0; i < userInput.length; i++) {
			System.out.println( i + "\t" + userInput[i]);
		}
*/
		//Finding the sum of the array 
		int userInput[] = {10, 11, 12, 13, 14, 15};
		int total = 0;
		
		for (int i = 0; i < userInput.length; i++) {
			//total = total + userInput[i];
			total += userInput[i];  /* Another way of writing the above total statement */ 
		}
		
		System.out.println("Total is :" + total);
	}

}
