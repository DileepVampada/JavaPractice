import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Hash Map, Tree Map, Linked Hash Map
//		Hash Map - No Duplication is allowed. Will override with new value.
//		Tree Map - should contain Keys of same data type. 
		
		Map m = new HashMap();
	
		m.put("input1", 100);
		m.put("input2", 92);
		m.put(1, 12);   
		m.put(1, 22);
		m.put("input2", 90); 	//overrides the value 	
		
		m.containsValue("92");  //checks given value  
		m.containsKey(1);       //checks given key
		m.values(); 			//prints all the values
		
		System.out.println(m);
		System.out.println(m.get(1));
		System.out.println(m.isEmpty());	//checks if container is Empty
	
/*		Map m = new TreeMap();
		
		m.put("input1", 10);
		m.put("input2", 92);
		m.put("1", 90);
		m.put("input2", 92);
		 
		System.out.println(m);
		System.out.println(m.get("input1"));
*/	
		
/*		Map m = new LinkedHashMap();
		
		m.put("input1", 10);
		m.put("input2", 92);
		m.put(1, 90);
		m.put("a", "b");
		
		System.out.println(m);
		System.out.println(m.get("input1"));
*/
	}

}
