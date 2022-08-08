public class Problem18{
  public static void main(String[] args){
   
    
    // Problem-18 -> Find the Maximum difference between two Array Elements
		int arr[] = {7, 9, 5, 6, 13, 2};
		int max = 0;
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = i + 1; j<arr.length; j++) {
				
				if(arr[i] < arr[j]) {
					max = Math.max(max, (arr[j] - arr[i]));
				}
			}
		}
		
		System.out.println(max);
		
  
  }
}
