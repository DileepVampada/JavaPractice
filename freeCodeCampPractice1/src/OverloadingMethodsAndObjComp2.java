
public class OverloadingMethodsAndObjComp2 {
	
	private String name;
	
	public OverloadingMethodsAndObjComp2(String name) {
		this.name = name;
	}
	
	//OverloadingMethodsAndObjComp2 is an class name & OtherName is the class object
	public boolean myMethod(OverloadingMethodsAndObjComp2 OtherName) {
		if(this.name == OtherName.name) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int compareTo(OverloadingMethodsAndObjComp2 OtherName) {
		return this.name.compareTo(OtherName.name);
	}
}
