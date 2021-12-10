
public class toStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		toStringEx2 userObj = new toStringEx2(5, 1, 2021);
		
		CompositionClass userObj2 = new CompositionClass ("DileepVampada", userObj);
		
		System.out.println(userObj2);
		
		//	Commenting the below to print the value from the sub class constructor to use this 	
		// System.out.println(userObj.myMethod());
		
	}

}
