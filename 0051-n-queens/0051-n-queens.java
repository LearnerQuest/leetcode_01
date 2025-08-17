class Solution {
    public List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];  
        queens(board, 0);                      
        return ans;
    }

    public void queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);                     
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;         
                queens(board, row + 1);         
                board[row][col] = false;        
            }
        }
    }

    public boolean isSafe(boolean[][] board, int row, int col) {
      
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }

        int minLeft = Math.min(row, col);
        for (int i = 1; i <= minLeft; i++) {
            if (board[row - i][col - i]) return false;
        }

      
        int minRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= minRight; i++) {
            if (board[row - i][col + i]) return false;
        }

        return true; 
    }

    public void display(boolean[][] board) {
        List<String> queenAns = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder temp = new StringBuilder();
            for (boolean cell : row) {
                temp.append(cell ? 'Q' : '.');
            }
            queenAns.add(temp.toString());
        }
        ans.add(queenAns);  
    }
}