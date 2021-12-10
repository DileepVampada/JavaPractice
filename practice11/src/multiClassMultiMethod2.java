
public class multiClassMultiMethod2 {
	
	private double Sub;
	
	public void myMethod(double input1, double input2 ) {
		Sub = input1 - input2;
	}

	public double getMethod() {
		return Sub;
	}
	
	public void result() {
		System.out.printf("Result is %s", getMethod());
	}
}
