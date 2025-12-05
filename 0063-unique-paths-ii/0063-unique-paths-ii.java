class Solution {
    private int func(int m, int n, int[][] matrix) {
        
        int[] prev = new int[m];
        int[] curr = new int[n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                if (matrix[i][j] == 1) {
                    curr[j] = 0;
                    continue;
                }
                if (i == 0 && j == 0) {
                    curr[j] = 1;
                    continue;
                }

                int up = 0;
                int left = 0;

                if (i > 0)
                    up = prev[j];
                if (j > 0)
                    left = curr[j - 1];

                curr[j] = up + left;
            }
            
            prev = curr.clone();
        }

        return prev[n - 1];
    }
    public int uniquePathsWithObstacles(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        return func(m, n, matrix);
    }
}
