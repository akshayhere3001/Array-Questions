class Problem8 {
    public static void swapAlternate(int[] arr){
        int temp = 0;
        
        for(int i = 0; i<arr.length; i= i + 2){
            if(arr[i] < Integer.MAX_VALUE){
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        
    }
    
    public static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
       
        int arr[] = {1,3,2,4,6,7};
        
        swapAlternate(arr);
        printArray(arr);
        
        
        
        
    }
}
