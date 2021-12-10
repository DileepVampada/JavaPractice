
public class toStringEx2 {
	
	private int day;
	private int month;
	private int year;
	
	public toStringEx2(int d, int m, int y) {
		
		day = d;
		month = m;
		year = y;	
		
//		System.out.printf("This is printed from subclass Constructor %s", this);
	}
	
	//changing the method name to toString to access using this 	
	//	public String myMethod() {
	
	public String toString() {	
		return String.format("%d/%d/%d", day, month, year);
	}
}
