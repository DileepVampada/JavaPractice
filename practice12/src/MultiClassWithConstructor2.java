
public class MultiClassWithConstructor2 {

	private String fMovie;
	
	/* This is a Constructor replaces the get Method */
	public MultiClassWithConstructor2(String fMovie2) {
		fMovie = fMovie2;
	}
	
	//This method is set values to the variable
	/*	public void setMethod(String fMovie2) {
	*		fMovie = fMovie2;
	*	}
	*/	
	
	
	/* This method gets value to the variable */
	public String getMethod() {
		return fMovie;
	}
	
	/* This method just shows the result */
	public void result() {
		System.out.printf("Your fav movie is %s \n", getMethod());
	}
	
}
