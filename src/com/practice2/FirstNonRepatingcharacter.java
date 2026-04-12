package com.practice2;
import java.util.Scanner;
public class FirstNonRepatingcharacter {
	
	public static void main(String [] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		for(int i=0;i<str.length();i++) {
			boolean isReapeating = false;
			for(int j=0;j<str.length();j++) {
				if(i!=j && str.charAt(i) == str.charAt(j)) {
					isReapeating = true;
					break;
				}
			}
			if(!isReapeating) {
				System.out.print(str.charAt(i));
			}
		}
	}
	
}
