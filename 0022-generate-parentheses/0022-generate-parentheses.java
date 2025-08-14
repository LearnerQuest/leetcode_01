class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack("", 0, 0, n, result);
        return result;
    }
        private static void backtrack(String current, int open, int close, int max, List<String> result) {
        // Base case: if current length = max*2, store result
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // If we can add '(' (open < max), do so
        if (open < max) {
            backtrack(current + "(", open + 1, close, max, result);
        }

        // If we can add ')' (close < open), do so
        if (close < open) {
            backtrack(current + ")", open, close + 1, max, result);
        }
        }
}