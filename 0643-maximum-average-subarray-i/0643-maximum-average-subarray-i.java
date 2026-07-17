class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum =0;
        int left=0;
        int maxSum = Integer.MIN_VALUE;
        for(int right = 0; right < nums.length; right++){
            windowSum +=nums[right];
            if(right-left+1 == k){
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= nums[left];
                left++;
            }
            

        }
        return (double) maxSum/k;
    }

}