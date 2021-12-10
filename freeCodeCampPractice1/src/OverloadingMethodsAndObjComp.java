
public class OverloadingMethodsAndObjComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingMethodsAndObjComp2 userObj = new OverloadingMethodsAndObjComp2("Dee123");
		
		OverloadingMethodsAndObjComp2 userObj2 = new OverloadingMethodsAndObjComp2("Dee12");
		
		System.out.println(userObj.myMethod(userObj2));
		
		System.out.println(userObj.compareTo(userObj2));
		
	}

}
