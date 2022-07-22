public class Problem5{
  public static void main(String[] args){
    
    		// Problem-5 -> Write a java Program to reverse an Array
		
		int[] arr = {1, 2, 3, 4, 5};
		
		// length of an Array
		int len = arr.length;
		
		// temperory variable for swapping
		int temp;
		
		// use floorDiv method to get the greatest integer
		int n = Math.floorDiv(len, 2);
		// get the middle element from an array (which remain as it is in an array)
		// and other element will be swap
		
		for(int i = 0; i<n; i++) {
			
			temp = arr[i];
			arr[i] = arr[len - 1 - i];
			arr[len - 1 - i] = temp;
		}
		
		// printing the result with for-Each Loop
		for(int element: arr) {
			System.out.print(element + " ");
		}

    
  }
}
  
