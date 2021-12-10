
public class MultiDimensionalArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userInput1[][] = {{0, 1, 2}, {3, 4, 5, 6}, {7, 8, 9, 10, 11}};
		int userInput2[][] = {{20, 21, 22}, {23, 24, 25, 26}, {27, 28, 29, 30, 31}};
		
		System.out.println("This is UserTable 1");
		newMethod(userInput1);
		
		System.out.println();
		System.out.println("This is UserTable 2");
		newMethod(userInput2);
	}
	
	public static void newMethod (int userInput[][]) {
		
		for(int i = 0; i < userInput.length; i++) {
			for(int j = 0; j < userInput[i].length; j++) {
				System.out.print(userInput[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
}
