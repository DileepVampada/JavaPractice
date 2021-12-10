
public class ClassTimeEx2 {
	
	private int date;
	private int month;
	private int year;
	
	public ClassTimeEx2(int d, int m, int y) {
		date = d;
		month = m;
		year = y;
		
		//	System.out.println(Calendar());
		System.out.printf("This is pritned from subclass using this %s",this);
	}
	
	public String toString() {
		return String.format("%d/%d/%d", date, month, year);
	}
}
