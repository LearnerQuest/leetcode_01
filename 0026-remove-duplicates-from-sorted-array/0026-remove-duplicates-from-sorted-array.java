class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        int j=0;
        for(int i=1;i<n; i++){
            if(nums[j] != nums[i]){
                nums[++j]= nums[i];
            }
        }
        return ++j;
    }
}