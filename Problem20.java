public class Problem20{
  public static void main(String[] args){
  
    
    	// Problem-20 -> Find the element which appears only once in a Sorted Array
		// Every element appear twice except one element
		
		int arr[] = {1, 1, 2, 3, 3, 44, 44, 55, 55};
		int res = 0;
		
    // Using HashMap
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i<arr.length; i++) {
			countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);
		}
		
		for(Map.Entry<Integer, Integer> entry: countMap.entrySet()) {
			
			if(entry.getValue() == 1) {
				res = entry.getKey();
				break;
			}
				
		}
		
		System.out.println(res);
		
		int res2 = 0;
    
		// XOR Property (Optimize Approach)
		for(int i: arr) {
			res2 ^= i;
		}
		
		System.out.println(res2);

  
  }
}
