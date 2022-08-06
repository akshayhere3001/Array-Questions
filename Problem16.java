public class Problem16{
  public static void main(String[] args){
  
  
    		// Problem-16 -> Sort an Array of 0's, 1's and 2's
		int arr[] = {0, 2, 1, 0, 0, 1, 1, 2, 1, 0};
		
		
		int zeroCount = 0;
		int oneCount = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == 0) {
				zeroCount++;
			}
			if(arr[i] == 1) {
				oneCount++;
			}
		}
		
		
		for(int i = 0; i<zeroCount; i++) {
			arr[i] = 0;
		}
		
		for(int i = zeroCount; i<(zeroCount + oneCount); i++) {
			arr[i] = 1;
		}
		
		for(int i = (zeroCount + oneCount); i<arr.length; i++) {
			arr[i] = 2;
		}
		
		
		// Printing Array
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
    
    
  
  }
}
