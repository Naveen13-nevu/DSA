package com.interview.preparation;

import java.util.Scanner;

public class Anagram {
	
	public static boolean isAnagram(String s1,String s2) {
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		char arr1 [] = s1.toCharArray();
		char arr2 [] = s2.toCharArray();
		
		bubbleSort(arr1);
		bubbleSort(arr2);
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		
		return true;
	}
	
 public static void bubbleSort(char []arr) {
	 int n = arr.length;
	 
	 for(int i=0;i<n-1;i++) {
		 for(int j=0;j<n-i-1;j++) {
			 if(arr[j]>arr[j+1]) {
				 char temp = arr[j];
				 arr[j] = arr[j+1];
				 arr[j+1] = temp;
			 }
		 }
	 }
 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String 1: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the String 2: ");
		String str2 = sc.nextLine();
		
		
		boolean result = isAnagram(str1,str2);
		
		System.out.println(result);
	
	}
}
