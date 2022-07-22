import java.util.Arrays;

public class ArrayQuestions {
	public static void main(String[] args) {
		
		// Problem-1 -> Create an Array of 5 float and Calculate their sum
		
		float[] arr = {1.2F, 1.3F, 1.4F, 1.5F, 1.6F};
		float sum = 0;
		for (int i = 0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.print(sum);
  	
  
  }
}
