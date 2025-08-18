class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, i, j, 0, word)) return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, int index, String word) {
        // base case: found full word
        if (index == word.length()) return true;

        // boundary + mismatch check
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length 
            || board[i][j] != word.charAt(index)) {
            return false;
        }

        // temporarily mark cell as visited
        char temp = board[i][j];
        board[i][j] = '#';

        // explore neighbors
        boolean found =
            dfs(board, i + 1, j, index + 1, word) ||
            dfs(board, i - 1, j, index + 1, word) ||
            dfs(board, i, j + 1, index + 1, word) ||
            dfs(board, i, j - 1, index + 1, word);

        // backtrack (restore)
        board[i][j] = temp;

        return found;
    }
}
