import java.util.Arrays;

public class sortArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 5, 9, 0, 14, -7};
		
		Arrays.sort(arr);
		
		for(int i:arr) {
			System.out.print(i + ",");
		}
	}

}
