package Practice3;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		int left =0;
		int right = str.length()-1;
		char ch[] = str.toCharArray();
		while(left<right) {
			
			char temp = ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			
			left++;
			right--;
		}
		for(char n:ch) {
			System.out.print(n+"");
		}
	}

}
