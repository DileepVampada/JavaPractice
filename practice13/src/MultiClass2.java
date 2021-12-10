
public class MultiClass2 {
	
	private int puppyAge;
	
	public MultiClass2(String Name) {
		System.out.println("Name of the puppy is:" + Name);
	}
	
	public void setAge(int Age) {
		puppyAge = Age;
	}
	public int getAge() {
		return puppyAge;
	}
	
	public void Result() {
		System.out.printf("Age of the puppy is %s \n", getAge());
	}
}
