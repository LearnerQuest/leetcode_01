class Solution {
    public static int leftSearch(int[] nums,int target) {
        int r = nums.length-1;
        int l = 0;
        while(l<=r) {
            int m = l + (r-l)/2;
            if(target > nums[m]) l = m+1;
            else r = m-1;
        }
        return l;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int l = leftSearch(nums,target);
        if(l== nums.length || target!=nums[l]) return new int[]{-1,-1};
        int r = leftSearch(nums,target+1);
        return new int[]{l,r-1};
    }
}