class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int minLength= Integer.MAX_VALUE;
        int windowSum =0;
        for(int right =0; right < nums.length; right++){
            windowSum += nums[right];
            while(windowSum >= target){
                int currentLength = right-left+1;
                minLength = Math.min(minLength, currentLength);
                windowSum -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}