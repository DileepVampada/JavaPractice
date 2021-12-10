
public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userInput1 [][] = {{1, 2, 3}, {4, 5, 6}, {7, 8,9}};
		
		System.out.println("This is User Table1");
		otherMethod(userInput1);
		
		System.out.println();
		
		int userInput2 [][] =  {{11, 12, 13, 14, 15}, { 16}, {17, 18, 19}, {20}};
		System.out.println("This is User Table2");
		otherMethod(userInput2);
	}
	public static void otherMethod (int userInput [][]) {
		
		for(int i = 0; i<userInput.length; i++) {
			for(int j = 0; j<userInput[i].length; j++) {
				System.out.print(userInput[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
