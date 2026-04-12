package com.interview.preparation;

public class SumOfDigitsUntilSingleDigitRemains {
	
	public static int findSingleDigit(int n) {
		
		while(n>=10) {
			int sum =0;
			
			while(n>0) {
				int d = n%10;
				sum = sum+d;
				n = n/10;
			}
			n = sum;
		}
		
		return n;
	}

	public static void main(String[] args) {

		int n = 9875;
		int result = findSingleDigit(n);
		System.out.println(result);

		
	}

}
