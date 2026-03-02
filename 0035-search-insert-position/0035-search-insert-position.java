class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == target) return i;               
        }
        int q = n-1;
        while(q>=0){
            if(target ==0 && nums[0]>0){
                return 0;
            }
            if(nums[q]<target){
                return q+1;
            }else if(nums[0]> target){
                return 0;
            }
            q--;
        }
        if(n ==1 && target>nums[0]){
            return 1;
        }
        else if (n ==1 && target<nums[0]){
            return 0;
        } 
        return -1;
    }
}