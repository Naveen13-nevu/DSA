package com.practice2;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
	
		boolean isPalindrome = true;
		int left = 0;
		int right = str.length()-1;
		while(left<right) {
			if(str.charAt(left) != str.charAt(right)) {
				isPalindrome = false;
			}
			left++;
			right--;
		}
		if(isPalindrome) {
			System.out.print(str + " "+"is a palindrome");
		}
		else {
			System.out.print(str + " "+"is not a palindrome");
		}
	}

}
