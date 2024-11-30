package array;

public class Moving0ToLastUsingForloop {

	public static void main(String[] args) {
		int arr[] = {1,2,0,1,0,6,0,5,0,4,0,7};
		int index =0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[index]=arr[i];
				index++;
			}
			
				
			
			}
		
		for(int k=index;k<arr.length;k++) {
			arr[k]=0;
		}
			
		
		for(int print=0;print<arr.length;print++) {
			System.out.println(arr[print]);
		}

	}

}
