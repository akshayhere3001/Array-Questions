public class Problem14{
  public static void main(String[] args){
  
  
    		// Problem-14 -> Write a program to Merge the Two Sorted Array
		int[] arr1 = {1, 3, 5, 7, 9};
		int[] arr2 = {2, 4, 6, 8, 10};
    
    
		// getting the length of both the Array
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		// initializing the result
		int[] result = new int[len1 + len2];
		
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < len1 && j < len2) {
			
			if(arr1[i] < arr2[j]) 
				result[k++] = arr1[i++];
			
			else 
				result[k++] = arr2[j++];
			
		}
		
		while(i < len1) {
			result[k++] = arr1[i++];
		}
		
		while(j < len2) {
			result[k++] = arr2[j++];
		}
		
		
		// printing the result
		for(int item = 0; item<result.length; item++) {
			System.out.print(result[item] + " ");
		}
    
    
  }
}
