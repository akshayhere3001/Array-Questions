public class Problem17{
  public static void main(String[] args){
  
    
    		// Problem-17 -> Using Bubble Sort, Recursively and Iteratively
		int arr[] = {6, 2, 1, 4, 3, 5};
		int temp = 0;
		
		for(int i = 0; i<arr.length - 1; i++) {
			for(int j = 0; j<arr.length - 1 - i; j++) {
				
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				
			}
		}
		
		// Printing the Array
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
    
    
  }
}
