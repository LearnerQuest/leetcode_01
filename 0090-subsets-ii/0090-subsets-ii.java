class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // Sort so duplicates are adjacent
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }
    
    private void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> res) {
        res.add(new ArrayList<>(current)); // Add current subset
        
        for (int i = start; i < nums.length; i++) {
            // Skip duplicates at same recursion depth
            if (i > start && nums[i] == nums[i - 1]) continue;
            
            current.add(nums[i]);
            backtrack(nums, i + 1, current, res); // Move forward
            current.remove(current.size() - 1);   // Backtrack
        }
    }
}