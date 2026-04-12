package com.interview.preparation;

import java.util.HashSet;

public class FindDuplicatesArrayUsingHashMap {

	  public static void findDuplicates(int[] arr) {

	        HashSet<Integer> set = new HashSet<>();
	        HashSet<Integer> duplicates = new HashSet<>();

	        for (int num : arr) {

	            if (set.contains(num)) {
	                duplicates.add(num); // duplicate found
	            } else {
	                set.add(num);
	            }
	        }

	        System.out.println(duplicates);
	    }

	  
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 2, 4};

        findDuplicates(arr);
	}

}
