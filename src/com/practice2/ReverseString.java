package com.practice2;

public class ReverseString {

	public static void main(String[] args) {

		String str = "naveen";
		char ch[] = str.toCharArray();
		int left=0;
		int right= str.length()-1;
		while(left<right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right]= temp;
			left++;
			right--;
		}
		for(char c: ch) {
			System.out.print(c);
		}
	}
}
