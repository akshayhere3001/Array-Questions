public class Problem19{
  public static void main(String[] args){
    
    
    // Problem-19 -> Find Minimum Element in a Sorted and Rotated Array
		// You may Assume that there is no duplicate element in an Array
		
		int arr[] = {5, 6, 1, 2, 3, 4};
		int min = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);

    
  }
}
