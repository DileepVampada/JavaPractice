
public enum practiceEnum2 {

	Dileep("He is on Lease for an Apartment", "27", "UofM", "FedEx Services"),
	Sandeep("He is on Lease for an Apartment with Dileep", "28", "UofM", "FedEx Sales"),
	Kapil("He is an tenant with Sandeep", "26", "UofM", "Paypal");
	
	private final String Description;
	private final String Age;
	private final String College;
	private final String Job;
	
	practiceEnum2(String userDesc, String userAge, String userCollege, String userJob){
		
		Description = userDesc;
		Age = userAge;
		College = userCollege;
		Job = userJob;
	}
	
	String getDescription() {
		return Description;
	}
	String getAge() {
		return Age;
	}
	String getCollege() {
		return College;
	}
	String getJob() {
		return Job;
	}
}
