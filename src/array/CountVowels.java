package array;

public class CountVowels {

	public static void main(String[] args) {
		
		String s = "JuGaALiua";
		String s1 = new String();
		int count = 0;
		int normalleter = 0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
				
				
				if(ch=='a' || ch == 'e'||  ch == 'i'||  ch == 'o'||  ch == 'u') {
					count++;
				}
				
				else {
					normalleter++;
				}
			}
		}
          System.out.println("Vowel Count "+count);
          System.out.println("Normal Letters "+normalleter);
	}

}
