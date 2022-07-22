import java.util.Arrays;

public class Problem{
  public static void main(String[] args){
    
    
    		// Problem-4 -> Create a java Program to add two Matrix of size 2x3
		
		int[][] mat1 = {{1,2,3}, {4,5,6}};
		int[][] mat2 = {{7,8,9}, {10,11,12}};
		
		int[][] result = {{0, 0, 0}, {0, 0, 0}}; // initially result is 0
		
		for (int i = 0; i<mat1.length; i++) {       // for rows
			for (int j = 0; j<mat1[i].length; j++) { // for columns
				result[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
	
		// Printing the Result
		for (int i = 0; i<mat1.length; i++) {       // for rows
			for (int j = 0; j<mat1[i].length; j++) { // for columns
				System.out.print(result[i][j] + " ");
				result[i][j] = mat1[i][j] + mat2[i][j];
			}
			System.out.println();
		}
    
    
  }
}
