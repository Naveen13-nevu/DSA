package com.interview.preparation;

public class ReverseWords {
	
	
	public static String reverseWords(String str) {
		
		String[] words = str.split(" ");
		String result = "";
		
		for(int i=words.length-1;i>=0;i--) {
			
			result = result+words[i];
			if(i != 0) {
				result = result + " ";
			}
		}
		
		return result;
	}

	public static void main(String[] args) {

		String input = " java is easy";
		String result = reverseWords(input);
		System.out.println(result);
	}

}
