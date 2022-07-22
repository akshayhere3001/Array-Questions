import java.util.Arrays;

public class Problem2{
  public static void main(String[] args){
      
      	// Problem-2 -> Write a program to find if the given number is present in an Array or not
        
		int[] arr = {12, 1, 2, 3, 6, 5};
		int num = 15;
		boolean isInArray = false;
		
		// solving by For-Each loop
		for(int element: arr) {
			if(num == element) {
				isInArray = true;
				break;
			}
		}
      
      
    }
 }
