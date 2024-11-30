package array;

public class FindTheElementThatAppearsOnce {

	public static void main(String[] args) {
		int arr[] = {2,3,1,1,6,3,2,4,2,4,8};
		
		for(int i=0;i<arr.length;i++) {
			boolean flag=false;
			
			for(int j=0;j<arr.length;j++) {
				if( i!=j && arr[i]==arr[j]) {
					flag=true;
					break;
				}
			}
			
			if(flag==false) {
				System.out.println(arr[i]);
			}
			
		}

	}

}
