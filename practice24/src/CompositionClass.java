
public class CompositionClass {

	
	private String userName;
	private toStringEx2 birthdate;
	
	public CompositionClass(String name, toStringEx2 date) {
		
		userName = name;
		birthdate = date;
	}
	
	public String toString() {
		return String.format("User Name of the person is %s and date of birth is %s", userName, birthdate);
	}
	
}
