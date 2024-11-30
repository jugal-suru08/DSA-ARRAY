package array;

public class CountNoOfWords {

	public static void main(String[] args) {
		
		String s = "Jugal Paresh Suru";
		int count=0;
		String words[] = s.split(" ");
		
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		
		System.out.println("Length of " +words.length);
		
		for(int i=0;i<words.length;i++) {
			if(!words[i].isEmpty())
			
			count++;
		}
		System.out.println("Number of words: " + count);
	}

	}

