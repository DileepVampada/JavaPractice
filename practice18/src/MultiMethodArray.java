
public class MultiMethodArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userInput[] = {100, 200, 300, 400, 500};
		
		changeX(userInput);
		
		for(int c:userInput) {
			System.out.println(c);
		}
	}
	
	//Second Method where changes are made
	public static void changeX(int userInput2[]) {
		
		for(int x = 0; x < userInput2.length; x++) {
			 userInput2[x] += 10;
		}
	}
}
