import java.util.Arrays;

public class Problem3{
  public static void main(String[] args){
    
    		// Problem-3 -> 3Calculate the average marks from an array Containing marks of all students in Physics!
		// using for each loop.

		int[] arr = {1, 2, 3, 5, 6, 4, 7, 8, 9, 10};
		int sum  = 0;
		
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		// average will be sum/length of an array (total outcomes)
		// getting the exact value by explicit type casting
		System.out.println((float)sum/arr.length);
    
    
    
  }
}
