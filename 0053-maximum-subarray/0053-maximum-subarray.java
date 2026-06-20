class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum =0;
        int max =Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
           currentsum += nums[i];
           max = Math.max(max, currentsum);
           if(currentsum <0){
            currentsum =0;
           }
        }
        return max;
    }
}