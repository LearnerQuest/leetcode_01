class Solution {
    public int minimumCost(int[] nums) {
        int first = nums[0];
        int nums1 = Integer.MAX_VALUE, nums2 = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) { 
            if(nums[i]<nums1){
                nums2 = nums1;
                nums1 = nums[i];
            }else if(nums[i]<nums2){
                nums2 =nums[i];
            }
        }
        return first+nums1+nums2;
    }
}