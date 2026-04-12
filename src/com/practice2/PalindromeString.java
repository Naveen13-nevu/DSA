package com.practice2;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		int left = 0;
		int right = str.length()-1;
		boolean isPalindrome = true;
		
		while(left<right) {
			if(str.charAt(left)!= str.charAt(right)) {
				isPalindrome = false;
			}
			left++;
			right--;
		}
		if(isPalindrome) {
			System.out.println(str+" is a palindrom");
		}
		else {
			System.out.println(str+" is not a palindrome");
		}

	}

}
