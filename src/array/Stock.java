package array;

public class Stock {

	public static void main(String[] args) {
		int [] arr = {6,3,5,7,8,2,9};
		
		int minPrice = arr[0];
		int maxProfit = 0;
		
		for(int i = 1;i<arr.length;i++) {
			
			if(arr[i]<minPrice) {
				minPrice = arr[i];
			}
			else {
				
			 int profit = arr[i] - minPrice;  
			
			if (profit > maxProfit) {
				
				maxProfit=profit;
				
			}
			
			}
		
// First calculate minPrice where we can buy the stock which will be initially a[0] and loop will start
// from a[1] then if minPrice > a[1] -->> MinPrice=a[1]	
// To calculate profit a[i] - minPrice 
// Then if profit > MaxProfit
// MaxProfit=profit
			

	}
		System.out.println(minPrice);
		System.out.println(maxProfit);
	}
}
