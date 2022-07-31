public class Problem10{
  public static void main(String[] args){
  
    
    		// Problem-10 -> Segregate 0's and 1's in order
		int arr[] = {0, 1, 0, 1, 0, 0, 1};
		
		int j = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == 0) {
				arr[j++] = arr[i];
			}
		}
		
		// we have already shifted 0's in the right side with the help of For Loop
		// now come 1's 
		while(j < arr.length) {
			arr[j++] = 1;
		}
		
		for(int k = 0; k<arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
    
    
    
  }
}
