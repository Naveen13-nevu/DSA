package com.practice2;

import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		int maxLength =0;
		
		for(int i=0;i<str.length();i++) {
			
			boolean visited[] = new boolean[256];
			int currentLength=0;
			
			for(int j=i;j<str.length();j++) {
				if(visited[str.charAt(j)]) {
					break;
				}
				visited[str.charAt(j)]=true;
				currentLength++;
			}
			if(currentLength>maxLength) {
				maxLength = currentLength;
			}
			
		}
		System.out.println(maxLength);

	}

}
