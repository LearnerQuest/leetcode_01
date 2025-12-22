class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();
        int[] dp = new int[m];
        int maxKeep = 0;

        for (int j = 0; j < m; j++) {
            dp[j] = 1;
            for (int k = 0; k < j; k++) {
                boolean valid = true;
                for (int i = 0; i < n; i++) {
                    if (strs[i].charAt(k) > strs[i].charAt(j)) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    dp[j] = Math.max(dp[j], dp[k] + 1);
                }
            }
            maxKeep = Math.max(maxKeep, dp[j]);
        }
        return m - maxKeep;
    }
}
