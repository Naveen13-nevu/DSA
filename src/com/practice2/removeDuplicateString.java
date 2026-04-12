package com.practice2;

import java.util.Scanner;

public class removeDuplicateString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		
		for(int i=0;i<str.length();i++) {
			boolean isDuplicate = false;
			for(int j=0;j<i;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					isDuplicate = true;
				}
				
			}
			if(!isDuplicate) {
				System.out.print(str.charAt(i));
			}
		}
		
	}

}
