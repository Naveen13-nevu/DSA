package com.interview.preparation;

public class EditDistance {

    public static int minDistance(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m + 1][n + 1];

        // 🔹 Base cases
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; // delete all characters
        }

        for (int j = 0; j <= n; j++) {
            dp[0][j] = j; // insert all characters
        }

        // 🔹 Fill DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                // If characters match
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } 
                else {
                    int replace = dp[i - 1][j - 1];
                    int delete  = dp[i - 1][j];
                    int insert  = dp[i][j - 1];

                    // 🔹 Find minimum manually (NO Math.min)
                    int min = replace;

                    if (delete < min) {
                        min = delete;
                    }

                    if (insert < min) {
                        min = insert;
                    }

                    dp[i][j] = 1 + min;
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {

        String word1 = "horse";
        String word2 = "ros";

        int result = minDistance(word1, word2);

        System.out.println("Minimum operations: " + result);
    }
}
