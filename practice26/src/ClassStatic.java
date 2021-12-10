
public class ClassStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassStatic2 userObj = new ClassStatic2("Dileep", "Vampada");
		ClassStatic2 userObj2 = new ClassStatic2("Ashok", "Vampada");
		ClassStatic2 userObj3 = new ClassStatic2("Raju", "Vampada");
		ClassStatic2 userObj4 = new ClassStatic2("VNR", "Vampada");
		
		System.out.printf(" \n Name: %s %s \n Member count is: %d", userObj2.getFirstName(), userObj2.getLastName(), userObj2.getmemberCount());
	}

}
