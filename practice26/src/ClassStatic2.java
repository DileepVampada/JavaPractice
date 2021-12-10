
public class ClassStatic2 {
	
	private String fName;
	private String lName;
	private static int memberCount = 0;
	
	public ClassStatic2(String FirstName, String LastName) {
		fName = FirstName;
		lName = LastName;
		memberCount++;
		
		System.out.printf(" \n Name of the user is %s%s And total membercount in his class is %d", fName,lName, memberCount);
	}
	
	public String getFirstName() {
		return fName;
	}
	
	public String getLastName() {
		return lName;
	}
	
	public static int getmemberCount() {
		return memberCount;
	}
}
