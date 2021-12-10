
public class multiClassAndMethod2 {

	private String userName;
	
	public void setName(String fullName) {
		userName = fullName;
	}
	
	public String getName() {
		return userName;
	}
	
	public void result() {
		System.out.printf("Name of the user is %s", getName());
	}
}
