package Practice3;

import java.util.Scanner;

public class StockBuyandSell {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the array element: ");
		int [] prices = new int[size];
		
		for(int i=0;i<size;i++) {
			prices[i] = sc.nextInt();
		}
		
		int min = prices[0];
		int profit = 0;
		
		for(int i = 0; i<prices.length;i++) {
			if(prices[i]<min) {
				min = prices[i];
			}
			int currentProfit = prices[i]-min;
			if(currentProfit > profit) {
				profit = currentProfit;
		}
	}
		System.out.println(profit);
	}
}
