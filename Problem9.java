public class Problem9{
  public static void main(String[] args){
  
    // Problem-9 -> Finding Duplicate Elements from an Array
    
    // Array
		int arr[] = {12,3,4,5,4,6, 6};
    
    // outer Loop to Iterate over an Array
		for(int i = 0; i<arr.length; i++) {
      // Inner Loop
			for(int j = i + 1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}else{
					return -1;
				}
				
			}
		}
    
    
  }
}
