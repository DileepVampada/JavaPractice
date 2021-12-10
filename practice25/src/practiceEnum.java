import java.util.EnumSet;

public class practiceEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(practiceEnum2 users:practiceEnum2.values()) {
			System.out.printf("%s\t%s\t%s\t%s\t%s\n", users, users.getDescription(), users.getAge(), users.getCollege(), users.getJob());
		}
		
			System.out.println("\n_____________Range___________\n");
		
		for(practiceEnum2 users: EnumSet.range(practiceEnum2.Sandeep, practiceEnum2.Kapil)) {
			System.out.printf("%s\t%s\t%s\t%s\t%s\n", users, users.getDescription(), users.getAge(), users.getCollege(), users.getJob());
		}
	}

}
