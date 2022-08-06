public class Problem15{
  public static void main(String[] args){
  
    // Problem-15 -> Find All Duplicates in an Array

		for(int i = 0; i<arr1.length; i++) {
			for(int j = i + 1; j<arr1.length; j++) {
				
				if(arr1[i] == arr1[j]) {
					System.out.print(arr1[i] + " ");
				}
				
			}
		}
		
  
  }
}
