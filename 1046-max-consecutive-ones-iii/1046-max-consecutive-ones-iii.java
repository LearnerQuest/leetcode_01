class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0, l=0 ,zeros =0;
        for(int r=0; r<nums.length; r++){
            if(nums[r] ==0) {
                zeros++;
            }
            while(zeros>k){
                if(nums[l] ==0){
                    zeros--;
                }
                l++;
            }
            max = Math.max(max, r-l+1);
            
        }
        return max;
    }
}