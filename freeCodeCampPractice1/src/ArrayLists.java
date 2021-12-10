import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList, LinkedList	
		ArrayList<Integer> array = new ArrayList<Integer>();

//		.add - adds particular value to the list
		array.add(32);
		array.add(59);
		array.add(143);
		array.add(14);
		array.add(43);
		array.add(43);
		array.add(1413);
		array.add(1430);
//		.set - is to assign particular value to given index
		array.set(5, 10);
		
//		.get() - gets the value from the particular index given
		System.out.println(array.get(2));
//		.sublist - gets the elements from particular index to given index.This does not include ending index.
//		More like an range.
		System.out.println(array.subList(1, 3));
		
		System.out.println(array);
	}

}
