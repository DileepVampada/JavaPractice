
public class Intro2ObjEx2 {
	
	public String name;
	public int age;
	
	public Intro2ObjEx2(String name, int age) {
		this.name = name;
		this.age = age;
		this.myMethod();
		this.staticMethod();
		Intro2ObjEx2.staticMethod(); // this is a static method and can be called using class.
		
//		this.myMethod();
//		Intro2ObjEx2.myMethod(); this regular method cannot be called without instancing or this keyword.
	}

	public void myMethod() {
		System.out.println("My name is " + this.name + " And my age is " + this.age );	
	}
	
	//static methods are used when we do not care about instance.
	public static void staticMethod() { 
		System.out.println("Hello");
	//	this.age =10;  cannot be used because we cannot use instance variables in static function.
	}
}
