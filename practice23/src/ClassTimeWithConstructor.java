
public class ClassTimeWithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassTimeWithConstructor2 userObj1 = new ClassTimeWithConstructor2();
		ClassTimeWithConstructor2 userObj2 = new ClassTimeWithConstructor2(5);
		ClassTimeWithConstructor2 userObj3 = new ClassTimeWithConstructor2(7, 5);
		ClassTimeWithConstructor2 userObj4 = new ClassTimeWithConstructor2(5, 10, 15);
		
		System.out.println(userObj1.myTime());
		System.out.println(userObj2.myTime());
		System.out.println(userObj3.myTime());
		System.out.println(userObj4.myTime());
	}

}
