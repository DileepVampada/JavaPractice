
public class UnkownArguments2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sum of new numbers: " + newMethod(5,10));
	}
	
	public static int newMethod(int...userInput) {
		
		int sum = 0;
		
		for(int x:userInput) {
			x += 5;
			sum += x;
		}
		return sum;
	}
}
