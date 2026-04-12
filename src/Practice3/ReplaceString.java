package Practice3;

import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		char ch [] = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			if(ch[i] == 'a') {
				ch[i] = 'o';
			}
				
		}
		for(char c : ch) {
			System.out.print(c);
		}

	}

}
