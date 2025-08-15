class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(k, n, 1, new ArrayList<>());
        return ans;
        
    }
    public void backtrack(int k, int target, int start, List<Integer> current){
        if (current.size() == k) {
            if (target == 0) ans.add(new ArrayList<>(current)); // valid combination
            return; // stop recursion
        }
        
        for (int i = start; i <= 9; i++) {
            if (i > target) break; // optimization: stop early
            current.add(i);
            backtrack(k, target - i, i + 1, current); // move to next number
            current.remove(current.size() - 1); // backtrack
        }
    }
    }
