package array;

public class ProductExceptSelf {

	public static void main(String[] args) {
		int arr [] = {3,6,7,8,9};
		int result [] = new int[arr.length];
        int product = 1;
        
        for(int i=0;i<arr.length;i++) {
        	product = product*arr[i];
        }
        System.out.println("Product "+product);
       
        
        for(int i=0;i<arr.length;i++) {
        	result[i] = product/arr[i];
        }
        for(int i=0;i<result.length;i++) {
        	System.out.println("At Index "+ i + " Answer "+result[i]);
        }
	}

}
