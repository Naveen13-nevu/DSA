package com.datastructure;

public class Kaprekar6174 {

	public static void main(String[] args) {
		int num = 1024;
		int result = 0;
		
		while(num != 6174) {
			int temp =  num;
			
			int digits [] = new int[4];
			
			for(int i=0;i<4;i++) {
				digits[i] = temp%10;
				temp = temp/10;
			}
			
			for(int i=0;i<4;i++) {
				for(int j=i+1;j<4;j++) {
					if(digits[i]>digits[j]) {
						int swap = digits[i];
						digits[i]=digits[j];
						digits[j]=swap;
					}
				}
			}
			
			int asc = 0;
			int des = 0;
			
			for(int i=0;i<4;i++) {
				asc = asc *10+digits[i];
			}
			for(int i=3;i>=0;i--) {
				des = des *10+digits[i];
			}
			result = des - asc;
			System.out.println(asc + " - "+ des+" -> "+result);
			num = result;
			
		}
		System.out.println("the constant reached: "+ result);
	}

}
