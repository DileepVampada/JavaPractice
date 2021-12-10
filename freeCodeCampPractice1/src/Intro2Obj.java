
public class Intro2Obj extends Intro2ObjEx2{
	
	public String breed;
	
	public Intro2Obj(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
		// TODO Auto-generated constructor stub
		
		System.out.println("This is cat " + this.name + " and age is " + this.age +" breed is " + this.breed);
	}

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		firstMethod("Dee1", 3);
	}

	public static void firstMethod(String str, int x) {
		for(int i = 0; i < x; i++) {
			System.out.println(str);
		}
	}
*/
	
}
