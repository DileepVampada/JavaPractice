import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map m = new java.util.HashMap();
		
		String str = "This is Dileep Vampada and I am learning Java";
		
		for(char x: str.toCharArray()) {
			
			if(m.containsKey(x)) {
				int old = (int) m.get(x);
				m.put(x, old+1);
			}
			else {
				m.put(x, 1);
			}
		}
		m.remove(' ');
		System.out.println(m);
	}

}
