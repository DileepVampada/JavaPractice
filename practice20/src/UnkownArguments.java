
public class UnkownArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Average: " + newMethod(2,3,5));
	}
	
	public static double newMethod(int...userInput) {
		
		double sum=0;
		
		for(double x:userInput) {
			sum += x;	
		}
		
		double avg = sum/userInput.length;
		return avg;
	}
}
