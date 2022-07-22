public class Problem7{
  public static void main(String[] args){
  
  		// Problem-7 -> Write a java program to check whether an array is sorted or not
		
		int[] arr = {23, 12, 3, 4, 5, 1};
		// boolean var for condition
		
		boolean isSorted = true;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > arr[i + 1]) {
				isSorted = false;
				break;
			}
		}
		
		if(isSorted)
			System.out.println("Array is Sorted");
		else
			System.out.println("Array is not Sorted");
    
    
  }
}
  
