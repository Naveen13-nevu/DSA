package com.interview.preparation;

import java.util.HashMap;

public class CountFrequencyUsingHashMap {

    public static void countFrequency(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {

            // If exists → increase count
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        System.out.println(map);
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 2};

        countFrequency(arr);
    }
}