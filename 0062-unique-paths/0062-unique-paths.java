class Solution {
    // Function to solve the problem using tabulation
    int func(int m, int n, int[][] dp) {
        // Loop through the grid using two nested loops
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Base condition
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                    continue; 
                }/*Build solution iteratively
✔ Start from base case (0,0)
✔ Fill grid until (m-1,n-1) */

                int up = 0;
                int left = 0;

                // Check cell above
                if (i > 0)
                    up = dp[i - 1][j];

                // Check cell to the left
                if (j > 0)
                    left = dp[i][j - 1];

                // Total ways to reach this cell
                dp[i][j] = up + left;
            }
        }
        return dp[m - 1][n - 1];
    }

    // Function to count total ways
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return func(m, n, dp);
    }
}