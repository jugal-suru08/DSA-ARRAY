package array;

public class ElementsOnTheRightAreGreater {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,2,1,4}; 
		
		     for(int i=0;i<arr.length;i++) {
		    	 
		    	 boolean target = false;
		    	 
		    	 for(int j=i+1;j<arr.length;j++) {
		    		 
		    		 if(arr[i]<=arr[j]) {
		    			 target = true;
		    			 break;
		    		 }
		    		 
		    	 }
		    		 
		    		 if(target==false) {
		    			 System.out.println(arr[i]);
		    		 }
		    	 
		     }

	}

}
