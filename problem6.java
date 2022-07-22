public class Problem6{
  public static void main(String[] args){
    
    
    		// Problem-6.1 -> Write a java Program to find a maximum element from an Array
    
    int[] arr = {1, 2000, 3, 4000 ,500, 760};
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
		
		
		// Problem-6.2 -> Write a java Program to find a minimum element from an Array
		
		int[] arr2 = {11, 2000, 3, 4000 ,500, 760};
		int min = Integer.MAX_VALUE;  // this will give Maximum Value as it is necessary to find an minimum element
		
		for(int item = 0; item<arr2.length; item++) {
			if(arr2[item] < min) {
				min = arr2[item];
			}
		}
		System.out.println(min);
    
    
  }
}
  
