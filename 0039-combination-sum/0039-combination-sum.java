class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates,target, 0, new ArrayList() , result);
        return result;
    }
    static void backtrack(int [] candidates, int target, int idx,  ArrayList<Integer> temp, List<List<Integer>> result){
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        if (target < 0 || idx == candidates.length) return;
        // choose
        temp.add(candidates[idx]);
        backtrack(candidates,  target - candidates[idx],idx, temp, result);
        temp.remove(temp.size() - 1); // unchoose

        // skip
        backtrack(candidates,  target,idx+1, temp, result);
    }
}