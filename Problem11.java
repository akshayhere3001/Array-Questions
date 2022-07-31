import java.util.Arrays;

public class Problem11{
  public static void main(String[] args){
    
    
    int arr[] = {12, 141, 4, 5, 6, 12, 4, 90, 9, 5};
		// First Sort an Array
		Arrays.sort(arr);

		int j = 0;
		
		for(int i = 0; i<arr.length - 1; i++) {
			if(arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		
		// last Element of an Array
		arr[j++] = arr[arr.length - 1];
		
		for(int k = 0; k<j; k++) {
			System.out.print(arr[k] + " ");
		}
    
    
  }
}
