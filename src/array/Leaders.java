package array;

public class Leaders {

	public static void main(String[] args) {
		
		int arr [] = {16, 17, 4, 3, 5, 2};
		
		for(int i=0;i<arr.length;i++) {
			boolean flag = true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					flag = false;
					break;
				}
				
			}
			if(flag==true) {
				System.out.println(arr[i]);
			}
		}
		
		
		}
		
			
		}

	


