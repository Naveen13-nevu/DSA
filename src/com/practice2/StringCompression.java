package com.practice2;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		for(int i=0;i<str.length();i++) {
			int count =1;
			while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
				i++;
				count++;
			}
			System.out.print(str.charAt(i)+""+count);
		}

	}

}
