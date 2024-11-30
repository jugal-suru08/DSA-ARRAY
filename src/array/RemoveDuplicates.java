package array;

public class RemoveDuplicates {

	public static void main(String[] args) {
	
		String s = "programming";
		StringBuilder s1 = new StringBuilder();
		
	    char arr[] = s.toCharArray();
	    
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			boolean isDuplicate = false;
			
			for(int j=0;j<s1.length();j++) {
				if(s1.charAt(j)==c) {
					isDuplicate = true;
					break;
				}
			}
			
			if(isDuplicate==false) {
				s1.append(c);
			}
		}
          System.out.println(s1);
	}

}
