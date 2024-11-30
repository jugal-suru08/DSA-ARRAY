package array;

public class CheckDuplicates {

    public static void main(String[] args) {
        String s = "array";
        char ch[] = s.toCharArray();

        
        for (int i = 0; i < ch.length; i++) {
            
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    
                    System.out.println("Duplicate: " + ch[i]);
                    break;
                }
            }
        }
    }
}