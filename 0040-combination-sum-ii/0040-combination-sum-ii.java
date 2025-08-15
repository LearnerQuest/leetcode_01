class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> current = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, 0, current); // no sum, just target
        return ans;
    }
    void helper(int[] candidates, int target, int indx, List<Integer> current) {
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) return;

        for (int i = indx; i < candidates.length; i++) {
            if (i > indx && candidates[i] == candidates[i - 1]) continue; // skip duplicates
            current.add(candidates[i]);
            helper(candidates, target - candidates[i], i + 1, current);
            current.remove(current.size() - 1);
        }
    }
}
