package com.datastructure;

public class FreequencyOfCharacter {

	public static void main(String[] args) {
		
		String str = "ProgrammingInJava";
		
		for(int i=0;i<str.length();i++) {
			
			int count =1;
			
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			
			boolean AlreadyCounted = false;
			
			for(int k=0;k<i;k++) {
				if(str.charAt(i)==str.charAt(k)) {
					AlreadyCounted = true;
					break;
				}
			}
			
			if(!AlreadyCounted) {
				System.out.println(str.charAt(i)+" = "+ count);
			}
			
			
		}

	}

}
