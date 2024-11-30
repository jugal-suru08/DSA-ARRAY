package array;

public class MissingNumber {
	
	public static void main(String[] args) {
	
	int [] arr = {1,2,3,4,5,7,8,9,10};
	int sumOfN=0;
	int n = arr.length+1;
	int sumOfArr =0;
	int missingNumber=0;
	
	sumOfN= n*(n+1)/2;
	System.out.println(sumOfN);
	
	 for (int num : arr) {
         sumOfArr += num;
     }
	

	System.out.println(sumOfArr);
	
	 missingNumber=sumOfN-sumOfArr;
	 
	 System.out.println("Missing Number " +missingNumber);
	
	
	}

}
