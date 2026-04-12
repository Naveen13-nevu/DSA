package com.interview.preparation;
import java.util.*;

public class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.offer(num);

            if (pq.size() > k) {
                pq.poll(); // remove smallest
            }
        }

        return pq.peek(); // kth largest
    }

    public static void main(String[] args) {

        int[] nums = {3,2,1,5,6,4};
        int k = 3;

        System.out.println(findKthLargest(nums, k)); // Output: 5
    }
}