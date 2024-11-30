package array;

public class SumOfDigits {

	public static void main(String[] args) {
		int num = 214;
		int result =0;
		
		while(num>0) {
			int digit=num%10; // If i want last digit of a number do %10;
		    result=digit+result; // 1st iteration 4
			num=num/10;
		}
		System.out.println(result);

	}

}
