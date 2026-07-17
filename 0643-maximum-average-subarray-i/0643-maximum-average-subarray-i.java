class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int WindowSum =0;
        for(int i=0; i< k; i++){
            WindowSum +=nums[i];
        }
        int maxSum = WindowSum;
        for(int right = k; right < nums.length; right++){
            WindowSum +=nums[right];
            WindowSum -= nums[right-k];
            maxSum = Math.max(maxSum, WindowSum);
            

        }
        return (double) maxSum/k;
    }

}