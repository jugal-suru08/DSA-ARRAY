package array;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Moving0sToLast {

	public static void main(String[] args) {
		
		int arr[] = {1,0,2,0,7,8,0,9,0,5};
		
		int i=0;
		int index=0;
		
		
		
		while(i<arr.length) {
			if(arr[i]!=0) {
				arr[index]=arr[i]; //1
				index++;
				
			}
			i++;
		}
		while(index<arr.length) {
			arr[index]=0;
			index++;
		}
		
          for(int k=0;k<arr.length;k++) {
        	  System.out.println(arr[k]);
          }
	}

}
