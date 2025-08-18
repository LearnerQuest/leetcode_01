class Solution {
    private static final String[] mapping = {
        "",    // 0
        "",    // 1
        "abc", // 2
        "def", // 3
        "ghi", // 4
        "jkl", // 5
        "mno", // 6
        "pqrs",// 7
        "tuv", // 8
        "wxyz" // 9
    };
    
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;
        
        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }
    
    private void backtrack(String digits, int index, StringBuilder path, List<String> result) {
        // base case: when the path length = digits length
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }
        
        String letters = mapping[digits.charAt(index) - '0'];
        for (char ch : letters.toCharArray()) {
            path.append(ch); // choose
            backtrack(digits, index + 1, path, result); // explore
            path.deleteCharAt(path.length() - 1); // un-choose (backtrack)
        }
    }
}
