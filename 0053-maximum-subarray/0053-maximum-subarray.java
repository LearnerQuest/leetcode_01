class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum =0;
        int max = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            currentsum += nums[i];
            if(currentsum <0) {
                currentsum= 0;
            }else{
                max = Math.max(max, currentsum);
            }
        }
        return max;
    }
}