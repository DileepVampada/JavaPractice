
public class ArrayMultiMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userInput[] = {5, 10, 15, 20};
		Multiply (userInput);
		
//		for(int i = 0; i < userInput.length; i++) {
		for(int i:userInput) {
			System.out.println(i);
		}
	}
	public static void Multiply (int userInput2[]) {
		
		for (int x = 0; x <userInput2.length; x++) {
		userInput2[x] *= 2;
//		for(int x:userInput2) {
//			x *= 2;
//			System.out.println(x);
		}
	}
}
