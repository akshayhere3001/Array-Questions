public class Problem13{
  	public static int[] twoSum(int arr[], int target) {
	
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = i + 1; j<arr.length; j++) {
				
				if(arr[j] == (target - arr[i])) {
					return new int[] {i, j};
				}
				
			}
		}
		throw new IllegalArgumentException("No such Pair");
	}
  
  
  public static void main(String[] args){
  
    
    // Problem-13 -> Two Sum Problem 
		int arr[] = {-1, 7, 1, 34, 28, 27};
		int target = 35;
		
		int[] result = twoSum(arr, target);
		
		for(int i = 0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
    
  
  }
}
