package array;

public class Palindrome {

	public static void main(String[] args) {
		
		String [] words = {"hello","madam","racecar"};
		
		for(int i=0;i<words.length;i++) {
			
			String word = words[i];
			boolean isPalindrome = true;
			int length = word.length();
		
			
			for(int j=0;j<length/2;j++) {
				if(word.charAt(j)!= word.charAt(length-1-j)) {
					isPalindrome = false;
					break;
				}
			}
		       if (isPalindrome) {
		    	   System.out.println(word+ " Is palindrome");
		    	   
		       }
		       else {
		    	   System.out.println(word+ " Is not palindrome");
		       }
		}

	}

}
