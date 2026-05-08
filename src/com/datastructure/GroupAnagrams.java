package com.datastructure;

import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagrams {

	public static String sort(String str) {
		
		char ch[] = str.toCharArray();
		int n = ch.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(ch[j] > ch[j+1]) {
					char temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = temp;
				}
			}
			
		}
		return new String(ch);
		
	}
	
	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		
		String str[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		for(String s: str) {
			String key = sort(s);
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(s);
		}
		
		System.out.println(map.values());

	}

}
