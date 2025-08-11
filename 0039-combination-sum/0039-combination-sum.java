class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> current = new ArrayList<>();
        helper(candidates, target, 0,0, current);
        return ans;
    }
    void helper(int[] candidates, int target, int sum, int indx, List<Integer> current){
        if(sum> target) return;
        if(sum == target){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i= indx; i<candidates.length; i++){
            current.add(candidates[i]);
            helper(candidates, target, sum+candidates[i] , i, current);
            current.remove(current.size()-1);
        }
    }
}