class Solution {
    public static int binarysearch(int[] nums, int target, int st, int end){
        if(st <= end){
            int mid = st+(end-st)/2;
            if(nums[mid] == target){
                return mid;
            }else if (nums[mid]<target){
                return binarysearch(nums, target, mid+1, end);

            }else{
                return binarysearch(nums, target, st, mid-1);
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        return binarysearch(nums, target, 0, nums.length-1);

    }
   

}