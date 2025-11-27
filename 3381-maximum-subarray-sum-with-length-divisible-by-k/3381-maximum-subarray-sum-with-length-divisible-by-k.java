class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long maxSum = Long.MIN_VALUE;
        long[] minPrefixSum = new long[k];
        for (int i = 0; i < k; i++) {
            minPrefixSum[i] = Long.MAX_VALUE;
        }
        
        minPrefixSum[0] = 0;
        
        long prefixSum = 0;
        
        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];
            int remainder = (i + 1) % k;
            
            if (minPrefixSum[remainder] != Long.MAX_VALUE) {
                maxSum = Math.max(maxSum, prefixSum - minPrefixSum[remainder]);
            }
            
            minPrefixSum[remainder] = Math.min(minPrefixSum[remainder], prefixSum);
        }
        
        return maxSum;
    }
}