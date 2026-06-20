class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int second =0;
        for(int i=0; i<nums.length; i++){
            second = target-nums[i];
            if(map.containsKey(second)){
                return new int[]{map.get(second), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}