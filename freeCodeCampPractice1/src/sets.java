import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Duplication is accepted
		Set<Integer> x = new HashSet<Integer>();
		
		Set<Integer> y = new TreeSet<Integer>();
		
		Set<Integer> z = new LinkedHashSet<Integer>();
		
		x.add(2);
		x.add(12);
		x.add(22);
		x.add(-2);
		x.remove(-2);
//		x.clear();
		x.isEmpty();
		x.size();
		
		boolean isPresent = x.contains(2);
		
		System.out.println(isPresent);
		System.out.println(x);
		System.out.println(x.isEmpty());
		System.out.println(x.size());
		
	}

}
