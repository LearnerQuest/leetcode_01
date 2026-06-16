class Solution {
     public void findsums(int start, int[] nums, List<Integer> current, List<List<Integer>> sums) {
        sums.add(new ArrayList<>(current));
        for(int i = start; i<nums.length; i++){
            if(i >start && nums[i] == nums[i-1]) continue;
            current.add(nums[i]);
            findsums(i+1, nums,current, sums);
            current.remove(current.size()-1);
        }
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> sums = new ArrayList<>();
        findsums(0, nums, new ArrayList<>(), sums);
        return sums;
    }
}