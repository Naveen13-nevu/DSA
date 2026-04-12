package com.datastructure;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String str = "aabbccdeef";
		
		for(int i=0;i<str.length();i++) {
			boolean isRepeating = true;
			
			for(int j=0;j<str.length();j++) {
				if( i != j && str.charAt(i)==str.charAt(j)) {
					isRepeating = false;
					break;
				}
			}
			if( isRepeating) {
				System.out.println(str.charAt(i));
				break;
			}
			
		}

	}

}
