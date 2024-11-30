package array;

public class SecondHighest {

	public static void main(String[] args) {
	
		int arr [] = {1,2,3,4,5,6,7,8,9};
		
		int secondMax =0;
		
		int max =0;  // 1
		 
		    for(int i=1;i<arr.length;i++) {
		    	if(arr[i]>max) { 
		    		max=arr[i];
		    		
		    	}
		    	
		    	
		    }
		    System.out.println("Max "+max);
		      for(int i=0;i<arr.length;i++) {
		    	  
		    	  if(arr[i]>secondMax && arr[i] < max) {  
		    		        secondMax=arr[i];
		    		  
		      }
		    	  
	    	  }
		      System.out.println("SecondMax "+secondMax);
		    

	}

}
