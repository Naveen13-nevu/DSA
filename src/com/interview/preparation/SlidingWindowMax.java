package com.interview.preparation;

import java.util.*;

public class SlidingWindowMax {

    public static int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> dq = new LinkedList<>();
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int index = 0;

        for (int i = 0; i < n; i++) {

            // Remove out of window elements
            if (!dq.isEmpty() && dq.peek() == i - k) {
                dq.poll();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.offer(i);

            // Store result
            if (i >= k - 1) {
                result[index++] = nums[dq.peek()];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        int[] res = maxSlidingWindow(nums, k);

        System.out.println(Arrays.toString(res));
    }
}