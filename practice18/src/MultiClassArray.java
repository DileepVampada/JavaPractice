
public class MultiClassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userInput[] = {10, 20, 30, 40, 50};
		
		MultiMethod(userInput);
		for (int x:userInput) {
			System.out.println(x);
		}
		
	}
	
	public static void MultiMethod (int userInput2[]) {
		
		for(int i = 0; i < userInput2.length; i++) {
			userInput2[i] +=5;
		}
	}
}
