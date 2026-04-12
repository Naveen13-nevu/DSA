package com.interview.preparation;

public class KadaneAlgorithm {

    public static int maxSubArray(int[] arr) {

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // Decide: extend or restart
            if (currentSum < 0) {
                currentSum = arr[i];
            } else {
                currentSum = currentSum + arr[i];
            }

            // Update max
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(arr)); // Output: 6
    }
}